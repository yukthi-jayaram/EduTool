package org.yukthi.edutool.dao.hibernate;

import java.util.List;

public class DaoUtil {

	/**
	 * check the list for the single element if exists it returns else null
	 * 
	 * @param objects
	 * @return
	 */
	public static <T> T singleObject(Class<T> typeOfObject, List<?> objects) {
		T object = null;
		if (objects != null && !objects.isEmpty()) {
			object = typeOfObject.cast(objects.get(0));
		}
		return object;
	}

}
