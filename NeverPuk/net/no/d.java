package net.no;

import java.io.IOException;
import java.util.List;
import net.no.s8;

public class d implements net.n2.k {
   private int r;
   private int[] v;

   public d() {
   }

   public d(net.ne.l var1) {
      s8.x();
      this.r = var1.G();
      List var3 = var1.H();
      this.v = new int[var3.size()];
      int var4 = 0;
      if(var4 < var3.size()) {
         this.v[var4] = ((net.ne.l)var3.get(var4)).G();
         ++var4;
      }

   }

   public void E(net.n2.h var1) throws IOException {
      this.r = var1.q();
      this.v = var1.o();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.a(this.r);
      var1.b(this.v);
   }

   public void C(net.x.t var1) {
      var1.M(this);
   }

   public int[] r() {
      return this.v;
   }

   public int s() {
      return this.r;
   }
}
