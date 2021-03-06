package inetAddress;

import java.net.InetAddress;

/**
 * Created by supreme on 16/3/5.
 */
public class inetAddressTest {
    public static void main(String[] args) throws Exception
    {
        if (args.length > 0)
        {
            String host = args[0];
            InetAddress[] addresses = InetAddress.getAllByName(host);

            for (InetAddress a : addresses)
                System.out.println(a);
        }else {
            InetAddress localHostAddress = InetAddress.getLocalHost();
            System.out.println(localHostAddress);
        }
    }
}
