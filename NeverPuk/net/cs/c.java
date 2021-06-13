package net.cs;

import java.io.IOException;
import java.security.PublicKey;
import net.xn;
import net.n2.k;
import net.ya.s;
import net.yz.az;

public class c implements k {
   private String m;
   private PublicKey W;
   private byte[] U;
   private static boolean P;

   public c() {
   }

   public c(String var1, PublicKey var2, byte[] var3) {
      this.m = var1;
      this.W = var2;
      this.U = var3;
   }

   public void E(net.n2.h var1) throws IOException {
      this.m = var1.Z(20);
      this.W = az.T(var1.J());
      this.U = var1.J();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.R(this.m);
      var1.Z(this.W.getEncoded());
      var1.Z(this.U);
   }

   public void N(s var1) {
      var1.E(this);
   }

   public String e() {
      return this.m;
   }

   public PublicKey F() {
      return this.W;
   }

   public byte[] s() {
      return this.U;
   }

   public static void l(boolean var0) {
      P = var0;
   }

   public static boolean I() {
      return P;
   }

   public static boolean i() {
      boolean var0 = I();
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(!i()) {
         l(true);
      }

   }
}
