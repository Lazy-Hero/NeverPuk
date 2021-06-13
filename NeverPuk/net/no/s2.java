package net.no;

import java.io.IOException;
import javax.annotation.Nullable;
import net.yz.m_;

public class s2 implements net.n2.k {
   @Nullable
   private m_ Q;

   public s2() {
   }

   public s2(@Nullable m_ var1) {
      this.Q = var1;
   }

   public void b(net.x.t var1) {
      var1.a(this);
   }

   public void E(net.n2.h var1) throws IOException {
      if(var1.readBoolean()) {
         this.Q = var1.z();
      }

   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeBoolean(this.Q != null);
      if(this.Q != null) {
         var1.Q(this.Q);
      }

   }

   @Nullable
   public m_ R() {
      return this.Q;
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
