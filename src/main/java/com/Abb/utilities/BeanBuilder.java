package com.Abb.utilities;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.BeanUtilsBean;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class BeanBuilder {

    static {
        BeanUtilsBean.getInstance().getConvertUtils().register(false, false, 0);
    }

    public static <T> List<T> buildList(List<?> list, String[] propertyOrder, Class<T> clazz) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        if (list == null || list.isEmpty()) {
            return new ArrayList<>();
        } else {
            List<T> result = new ArrayList<>();
            for (Object object : list) {
                result.add(buildEntity((Object[]) object, propertyOrder, clazz));
            }
            return result;
        }
    }

    public static <T> T buildEntity(Object[] row, String[] propertyOrder, Class<T> clazz) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        T lokasyon = clazz.newInstance();
        for (int i = 0; i < row.length; i++) {
            BeanUtils.setProperty(lokasyon, propertyOrder[i], row[i]);
        }
        return lokasyon;
    }
}
