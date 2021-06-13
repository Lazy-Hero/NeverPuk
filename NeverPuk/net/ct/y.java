package net.ct;

import com.google.common.util.concurrent.ListenableFuture;
import com.mojang.authlib.GameProfile;
import com.mojang.util.UUIDTypeAdapter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.Proxy;
import net.xn;
import net.ct.t;
import net.yv.o9;
import net.z.tt;

public class y {
   public static boolean I() {
      return net.nn.j.b().T.iI;
   }

   public static Proxy v() {
      return net.nn.j.b().u();
   }

   public static String J() {
      net.yz.u var0 = net.nn.j.b().L();
      return null;
   }

   public static String A() {
      t.j();
      net.yz.u var1 = net.nn.j.b().L();
      return var1 == null?null:var1.w();
   }

   public static long n() {
      return net.nn.j.E();
   }

   public static String G() {
      return net.nn.j.b().L().A();
   }

   public static String L() {
      return net.nn.j.b().L().m();
   }

   public static String S() {
      return net.nn.j.b().L().w();
   }

   public static String O(String var0) {
      return net.nn.j.b().Y().fillProfileProperties(new GameProfile(UUIDTypeAdapter.fromString(var0), (String)null), false).getName();
   }

   public static void f(t var0) {
      net.nn.j.b().s(var0.o());
   }

   public static String E() {
      return net.nn.j.b().sn.getAbsolutePath();
   }

   public static int m() {
      return o9.SURVIVAL.x();
   }

   public static int r() {
      return o9.CREATIVE.x();
   }

   public static int Y() {
      return o9.ADVENTURE.x();
   }

   public static int K() {
      return o9.SPECTATOR.x();
   }

   public static void L(boolean var0) {
      net.nn.j.b().f(var0);
   }

   public static ListenableFuture E(String var0, String var1) {
      return net.nn.j.b().g().Q(var0, var1);
   }

   public static void g() {
      net.nn.j.b().g().K();
   }

   public static boolean D() {
      return net.nn.j.b().T.t(net.nr.d.REALMS_NOTIFICATIONS);
   }

   public static boolean j() {
      int var0 = t.j();
      return net.nn.j.b().s5 != null && net.nn.j.b().s5 instanceof tt;
   }

   public static void H(File var0) {
      if(var0.exists()) {
         net.nj.f var1 = net.nj.x.r(new FileInputStream(var0));
         net.nj.f var2 = var1.o("Data");
         var2.A("Player");
         net.nj.x.z(var1, new FileOutputStream(var0));
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
