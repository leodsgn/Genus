package DAO;

/**
 * @author leoribeiro.dsgn@gmail.com
 */
public interface IGenericDao<E> {

    E create(E data);

    E read(int id);

    E read();

    E update(int id, E data);

    E delete(int id);

}