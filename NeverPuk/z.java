import java.util.Arrays;
import net.xn;
import net.cq.p;
import net.u.d;

public class z {
   private static int[] J;

   public static Object[] V(Object[] var0, Object[] var1) {
      Object[] var3 = Arrays.copyOf(var0, var0.length + var1.length);
      J();
      System.arraycopy(var1, 0, var3, var0.length, var1.length);
      if(d.y() == null) {
         O(new int[4]);
      }

      return var3;
   }

   public static void main(String[] var0) {
      int[] var1 = J();
      String var2 = System.getenv().containsKey("assetDirectory")?System.getenv("assetDirectory"):"assets";
      String[] var3 = new String[]{"--version", "mcp", "--accessToken", "0", "--assetsDir", var2, "--assetIndex", "1.12.2", "--userProperties", "{}"};
      p.main((String[])V(var3, var0));
      d.h(new d[1]);
   }

   public static void O(int[] var0) {
      J = var0;
   }

   public static int[] J() {
      return J;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      O(new int[3]);
   }
}
