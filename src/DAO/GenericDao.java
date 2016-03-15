package DAO;

import Models.GenericModel;

/**
 * @author leoribeiro.dsgn@gmail.com
 */
public abstract class GenericDao implements IGenericDao<GenericModel> {

    private GenericModel model;
    private String tableName;
    private String[] attributes;

    GenericDao(GenericModel model){
        this.model = model;
        this.tableName = model.getTableName();
        this.attributes = model.getModelAttributes();
    }

    @Override
    public GenericModel create(GenericModel data) {

        return null;
    }

    @Override
    public GenericModel read(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GenericModel read(){

        return null;
    }

    @Override
    public GenericModel update(int id,GenericModel data) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GenericModel delete(int id) {
        // TODO Auto-generated method stub
        return null;
    }



}
