package net.y;

import com.google.common.collect.Lists;
import java.util.List;
import net.y.d;
import net.yz.ac;

public abstract class a {
   private double k;
   private double J;
   private double L;
   protected List q = Lists.newArrayListWithCapacity(17424);
   protected boolean Z;

   public void c(double var1, double var3, double var5) {
      this.Z = true;
      this.q.clear();
      this.k = var1;
      this.J = var3;
      this.L = var5;
   }

   public void E(net.n5.m var1) {
      net.u.j var2 = var1.u();
      d.O((float)((double)var2.t() - this.k), (float)((double)var2.h() - this.J), (float)((double)var2.y() - this.L));
   }

   public void B(net.n5.m var1, ac var2) {
      this.q.add(var1);
   }

   public abstract void q(ac var1);
}
