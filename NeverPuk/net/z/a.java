package net.z;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import net.xn;
import net.z.g;
import net.z.k;
import net.z.t9;
import net.z.w4;
import net.z.wx;

public class a extends net.z.z {
   private final t9 f;
   private final List F = Lists.newArrayList();
   private final List M = Lists.newArrayList();
   private final net.z.z n = new wx();
   private int l = -1;

   public a(t9 var1, net.nn.j var2, int var3, int var4, int var5, int var6, int var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.f = var1;
   }

   public net.z.z m(int var1) {
      boolean var2 = g.C();
      if(var1 < this.F.size()) {
         return (net.z.z)this.F.get(var1);
      } else {
         var1 = var1 - this.F.size();
         return this.n;
      }
   }

   protected int V() {
      return this.F.size() + 1 + this.M.size();
   }

   public void n(int var1) {
      this.l = var1;
   }

   protected boolean z(int var1) {
      return var1 == this.l;
   }

   public int w() {
      return this.l;
   }

   public void E(net.cp.t var1) {
      this.F.clear();

      for(int var2 = 0; var2 < var1.u(); ++var2) {
         this.F.add(new w4(this.f, var1.V(var2)));
      }

   }

   public void W(List var1) {
      g.B();
      this.M.clear();
      Iterator var3 = var1.iterator();
      if(var3.hasNext()) {
         net.yp.o var4 = (net.yp.o)var3.next();
         this.M.add(new k(this.f, var4));
      }

   }

   protected int I() {
      return super.I() + 30;
   }

   public int C() {
      return super.C() + 85;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
