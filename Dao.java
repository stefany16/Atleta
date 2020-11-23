import java.io.RandomAccessFile;
import java.io.IOException;
import java.util.ArrayList;

class DAO {

      public void saveAll(ArrayList<Atleta> lista) {


        try {
          RandomAccessFile base = new RandomAccessFile("dados.txt", "rw"); 
          base.writeBytes("salvei");
        } catch(IOException erro) {

        }


      }


      public ArrayList<Atleta> loadAll(){

          ArrayList<Atleta> lista = null;
          //implementar responsabilidade
          return lista;

      }

}

