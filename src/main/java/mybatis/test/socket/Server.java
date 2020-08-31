package mybatis.test.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author lp
 * @date 2020/8/27 15:31
 */
public class Server {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket=new ServerSocket(8888);
            System.out.println("服务端已启动，等待客户端连接..");
            //侦听并接受到此套接字的连接,返回一个Socket对象
            Socket socket=serverSocket.accept();

            //获得输入输出流
            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter os = new PrintWriter(socket.getOutputStream());

            System.out.println("接收：" + is.readLine());

            //发送：{"status":1, "msg":"success", "data":"hhhhhh"}
            os.write("{\"status\":1, \"msg\":\"success\", \"data\":\"hhhhhh\"}");
            os.flush();
            socket.shutdownOutput();//关闭输出流

            //关闭相对应的资源
            os.close();
            is.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
