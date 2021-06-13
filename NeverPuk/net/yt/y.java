package net.yt;

import java.io.IOException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;
import net.xn;
import net.n2.h;
import net.n2.k;
import net.u.d;
import net.yt.l;
import net.yz.az;

public class y implements k {
   private byte[] o;
   private byte[] Z;

   public y() {
      l.z();
      super();
      this.o = new byte[0];
      this.Z = new byte[0];
      if(d.y() == null) {
         l.M(new String[4]);
      }

   }

   public y(SecretKey var1, PublicKey var2, byte[] var3) {
      l.z();
      this.o = new byte[0];
      this.Z = new byte[0];
      this.o = az.D(var2, var1.getEncoded());
      this.Z = az.D(var2, var3);
      d.h(new d[2]);
   }

   public void E(h var1) throws IOException {
      this.o = var1.J();
      this.Z = var1.J();
   }

   public void O(h var1) throws IOException {
      var1.Z(this.o);
      var1.Z(this.Z);
   }

   public void P(net.ya.z var1) {
      var1.O(this);
   }

   public SecretKey E(PrivateKey var1) {
      return az.g(var1, this.o);
   }

   public byte[] E(PrivateKey var1) {
      String[] var2 = l.z();
      return var1 == null?this.Z:az.I(var1, this.Z);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
