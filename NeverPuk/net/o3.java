package net;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.mf;
import net.xn;
import net.nb.f;
import net.ym.t;
import net.yw.n;

public class o3 {
   private final List x = new ArrayList();
   private final List a = new ArrayList();
   private final List r = Arrays.asList(new t[0]);

   public void u(t var1, n var2) {
      this.x.add(var1);
      this.a.add(var2);
   }

   public int H() {
      return this.x.size();
   }

   public t Z(int var1) {
      return (t)this.x.get(var1);
   }

   public n d(int var1) {
      String var2 = mf.O();
      return var1 >= 0 && var1 < this.a.size()?(n)this.a.get(var1):f.ou.p();
   }

   public List H(t var1) {
      this.r.set(0, var1);
      return this.r;
   }

   public void A() {
      this.x.clear();
      this.a.clear();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
