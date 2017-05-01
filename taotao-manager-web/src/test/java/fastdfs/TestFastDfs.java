package fastdfs;

import com.leiyu.taotao.util.FastDFSClient;
import org.csource.fastdfs.*;
import org.junit.Test;

/**
 * Created by wh on 2017/5/1.
 */
public class TestFastDfs {

    @Test
    public void testUpload() throws Exception{
        ClientGlobal.init("properties/client.conf");
        TrackerClient trackerClient = new TrackerClient();
        TrackerServer trackerServer = trackerClient.getConnection();
        StorageServer storageServer = null;
        StorageClient storageClient = new StorageClient(trackerServer,storageServer);
        String[] strings = storageClient.upload_file("E:\\照片\\贾静雯合影.jpg","jpg",null);
        for(String string : strings){
            System.out.println(string);
        }
    }

    @Test
    public void testFastDfsClient() throws Exception{
        FastDFSClient client = new FastDFSClient("properties/client.conf");
        String uploadFile = client.uploadFile("E:\\照片\\照片\\高中\\http_imgload.cgi(1).jpg","jpg");
        System.out.println(uploadFile);
    }

}
