package aplicativo;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Programa {
    public static void main(String[] args){
//        Pessoa p1 = new Pessoa(null,"Joao Pedro","joao@gmail.com");
//        Pessoa p2 = new Pessoa(null,"Pedro","pedro@gmail.com");
//        Pessoa p3 = new Pessoa(null,"Maria","maria@gmail.com");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

//        Pessoa p = em.find(Pessoa.class, 2); Pesquisa o Id 2 na tabela Pessoa e retorna o conteudo
//        System.out.println(p);

//        em.getTransaction().begin();//Se prepara pois vai ter alteracoes no Banco de Dados
//
//        em.persist(p1);
//        em.persist(p2);
//        em.persist(p3);
//
//        em.getTransaction().commit();//Pra confirmar as alteracoes feitas


        //Remover

        Pessoa p = em.find(Pessoa.class,2);
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
        System.out.println("Pronto !");


        em.close();
        emf.close();
    }
}
