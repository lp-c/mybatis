package mybatis.test.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * @author lp
 * @date 2020/8/27 15:30
 */
public class Client {

    public static void main(String [] args) throws InterruptedException, IOException
    {
        //创建socket
        InetSocketAddress addr = new InetSocketAddress("127.0.0.1", 8888);
        Socket sock = new Socket();
        //连接服务器
        sock.connect(addr);

        //获得输入输出流
        BufferedReader is = new BufferedReader(new InputStreamReader(sock.getInputStream()));
        PrintWriter os = new PrintWriter(sock.getOutputStream());

        //发送数据
        os.write("{\"type\": 0, \"taskid\":\"001\"}");
        os.flush();
        //关闭输出流
        sock.shutdownOutput();

        //获取接收到的数据
        String s = is.readLine();
        System.out.println("接收：" + s);

        //关闭流
        os.close();
        is.close();
        sock.close();
    }
}
