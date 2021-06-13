package net.no;

import java.io.IOException;
import java.util.List;
import net.xn;
import net.no.s8;

public class s_ implements net.n2.k {
   private int H;
   private List d;

   public s_() {
   }

   public s_(int var1, net.k.n var2, boolean var3) {
      s8.x();
      super();
      this.H = var1;
      this.d = var2.Z();
      var2.x();
      this.d = var2.I();
   }

   public void E(net.n2.h var1) throws IOException {
      this.H = var1.q();
      this.d = net.k.n.s(var1);
   }

   public void O(net.n2.h var1) throws IOException {
      var1.a(this.H);
      net.k.n.F(this.d, var1);
   }

   public void p(net.x.t var1) {
      var1.b(this);
   }

   public List L() {
      return this.d;
   }

   public int m() {
      return this.H;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
