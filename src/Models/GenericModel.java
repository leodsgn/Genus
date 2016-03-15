package Models;

import java.lang.reflect.Field;

/**
 * @author leoribeiro.dsgn@gmail.com
 */
public abstract class GenericModel {

    public String[] getModelAttributes(){
        String[] attributes = null;
        Field[] fields = this.getClass().getDeclaredFields();

        for(int x = 0; x < fields.length; x++){
            attributes[x] = fields[x].getName();
        }

        return attributes;
    }

    public String getTableName(){
        return this.getClass().getName();
    }

}
