package net.z;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import net.xn;
import net.no.sj;
import net.yv.of;
import net.yz.m_;
import net.z.g;
import net.z.t;
import net.z.w5;

public class o extends g {
   private static final m_ B = new m_("textures/gui/bars.png");
   private final net.nn.j Q;
   private final Map z = Maps.newLinkedHashMap();

   public o(net.nn.j var1) {
      this.Q = var1;
   }

   public void A() {
      boolean var1 = g.B();
      if(!this.z.isEmpty()) {
         t var2 = new t(this.Q);
         int var3 = var2.u();
         int var4 = 12;
         Iterator var5 = this.z.values().iterator();
         if(var5.hasNext()) {
            w5 var6 = (w5)var5.next();
            int var7 = var3 / 2 - 91;
            net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
            this.Q.n().E(B);
            this.D(var7, var4, var6);
            String var8 = var6.t().c();
            this.Q.sO.U(var8, (float)(var3 / 2 - this.Q.sO.r(var8) / 2), (float)(var4 - 9), 16777215);
            var4 = var4 + 10 + this.Q.sO.R;
            if(var4 >= var2.v() / 3) {
               ;
            }
         }
      }

   }

   private void D(int var1, int var2, of var3) {
      g.C();
      this.g(var1, var2, 0, var3.y().ordinal() * 5 * 2, 182, 5);
      if(var3.t() != of.f.PROGRESS) {
         this.g(var1, var2, 0, 80 + (var3.t().ordinal() - 1) * 5 * 2, 182, 5);
      }

      int var5 = (int)(var3.g() * 183.0F);
      this.g(var1, var2, 0, var3.y().ordinal() * 5 * 2 + 5, var5, 5);
      if(var3.t() != of.f.PROGRESS) {
         this.g(var1, var2, 0, 80 + (var3.t().ordinal() - 1) * 5 * 2 + 5, var5, 5);
      }

   }

   public void p(sj var1) {
      if(var1.L() == sj.k.ADD) {
         this.z.put(var1.J(), new w5(var1));
      } else if(var1.L() == sj.k.REMOVE) {
         this.z.remove(var1.J());
      } else {
         ((w5)this.z.get(var1.J())).O(var1);
      }

   }

   public void D() {
      this.z.clear();
   }

   public boolean c() {
      if(!this.z.isEmpty()) {
         for(of var2 : this.z.values()) {
            if(var2.Q()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean W() {
      if(!this.z.isEmpty()) {
         for(of var2 : this.z.values()) {
            if(var2.r()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean V() {
      if(!this.z.isEmpty()) {
         for(of var2 : this.z.values()) {
            if(var2.e()) {
               return true;
            }
         }
      }

      return false;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
