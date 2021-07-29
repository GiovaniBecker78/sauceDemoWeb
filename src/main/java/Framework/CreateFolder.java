package Framework;

import java.io.File;

public class CreateFolder {
    public static void createFolderReport(String path){
        File pathReport = new File(path);//criando caminho do path
        if(!pathReport.exists()){//se esse caminho não existir
            pathReport.mkdir();//cria-se o path
        }
    }
}
