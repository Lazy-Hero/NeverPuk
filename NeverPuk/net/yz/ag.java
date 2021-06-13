package net.yz;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.xn;
import net.yz.m_;

public class ag {
   private final Map T = Maps.newHashMap();
   private int i;

   public boolean E(net.n0.y var1) {
      return this.e(var1, 0.0F) > 0.0F;
   }

   public float e(net.n0.y var1, float var2) {
      ag.p var3 = (ag.p)this.T.get(var1);
      float var4 = (float)(var3.a - var3.q);
      float var5 = (float)var3.a - ((float)this.i + var2);
      return net.u.t.T(var5 / var4, 0.0F, 1.0F);
   }

   public void b() {
      m_.J();
      ++this.i;
      if(!this.T.isEmpty()) {
         Iterator var2 = this.T.entrySet().iterator();
         if(var2.hasNext()) {
            Entry var3 = (Entry)var2.next();
            if(((ag.p)var3.getValue()).a <= this.i) {
               var2.remove();
               this.Y((net.n0.y)var3.getKey());
            }
         }
      }

   }

   public void V(net.n0.y var1, int var2) {
      this.T.put(var1, new ag.p(this.i, this.i + var2));
      this.b(var1, var2);
   }

   public void H(net.n0.y var1) {
      this.T.remove(var1);
      this.Y(var1);
   }

   protected void b(net.n0.y var1, int var2) {
   }

   protected void Y(net.n0.y var1) {
   }

   private static xn a(xn var0) {
      return var0;
   }

   class p {
      final int q;
      final int a;

      private p(int var2, int var3) {
         this.q = var2;
         this.a = var3;
      }
   }
}
