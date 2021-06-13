package net.yz;

import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.nl.ze;
import net.no.i9;
import net.yz.m_;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class m1 {
   private final Logger a = LogManager.getLogger();
   private final net.yf.p X = new net.yf.p();
   private net.r.h A;
   private net.cr.s H;
   private boolean p;
   private net.nl.s Q;
   private ze W;
   private List i;

   public void G(net.r.h var1, @Nullable net.cr.s var2, boolean var3) {
      int var4 = m_.J();
      if(var1.y().Q(var2)) {
         this.A = var1;
         this.H = var2;
         this.p = var3;
         this.i = var1.aG.e;
         net.nl.v var5 = var1.aG;
         this.Q = null;
         this.W = null;
         if(var5 instanceof net.nl.m) {
            this.Q = ((net.nl.m)var5).o;
            this.W = ((net.nl.m)var5).Q;
         }

         if(var5 instanceof net.nl.j) {
            this.Q = ((net.nl.j)var5).W;
            this.W = ((net.nl.j)var5).T;
         }

         if(this.Q != null && this.W != null && (this.y() || var1.V8())) {
            this.X.L();
            var1.a8.Q(this.X, false);
            this.W.G(this.X);
            if(this.X.d(var2, (IntList)null)) {
               this.f();
            }

            this.D();
            var1.t1.h((net.n2.k)(new i9(var1.aG.S, var2)));
            var1.a8.W();
         }
      }

   }

   private void D() {
      net.r.i var1 = this.A.a8;

      for(int var2 = 0; var2 < this.W.e(); ++var2) {
         ks var3 = this.W.A(var2);
         if(!var3.B()) {
            while(var3.U() > 0) {
               int var4 = var1.b(var3);
               if(var4 == -1) {
                  var4 = var1.o();
               }

               ks var5 = var3.s();
               var5.u(1);
               var1.S(var4, var5);
               this.W.W(var2, 1);
            }
         }
      }

      this.W.T();
      this.Q.T();
   }

   private void f() {
      boolean var1 = this.H.c(this.W, this.A.hl);
      int var2 = this.X.S(this.H, (IntList)null);
      boolean var3 = true;

      for(int var4 = 0; var4 < this.W.e(); ++var4) {
         ks var5 = this.W.A(var4);
         if(!var5.B() && Math.min(var2, var5.j()) > var5.U()) {
            var3 = false;
         }
      }

   }

   private int o(int var1, boolean var2) {
      int var3 = 1;
      if(this.p) {
         var3 = var1;
      } else {
         var3 = 64;

         for(int var4 = 0; var4 < this.W.e(); ++var4) {
            ks var5 = this.W.A(var4);
            if(!var5.B() && var3 > var5.U()) {
               var3 = var5.U();
            }
         }
      }

      return var3;
   }

   private void v(int var1, IntList var2) {
      int var3 = this.W.Q();
      int var4 = this.W.X();
      if(this.H instanceof net.cr.j) {
         net.cr.j var5 = (net.cr.j)this.H;
         var3 = var5.M();
         var4 = var5.n();
      }

      int var12 = 1;
      IntListIterator var6 = var2.iterator();

      for(int var7 = 0; var7 < this.W.Q() && var4 != var7; ++var7) {
         for(int var8 = 0; var8 < this.W.X(); ++var8) {
            if(var3 == var8 || !var6.hasNext()) {
               var12 += this.W.Q() - var8;
               break;
            }

            net.nl.o var9 = (net.nl.o)this.i.get(var12);
            ks var10 = net.yf.p.W(((Integer)var6.next()).intValue());
            if(var10.B()) {
               ++var12;
            } else {
               for(int var11 = 0; var11 < var1; ++var11) {
                  this.d(var9, var10);
               }

               ++var12;
            }
         }

         if(!var6.hasNext()) {
            break;
         }
      }

   }

   private void d(net.nl.o var1, ks var2) {
      net.r.i var3 = this.A.a8;
      int var4 = var3.n(var2);
      if(var4 != -1) {
         ks var5 = var3.A(var4).s();
         if(!var5.B()) {
            if(var5.U() > 1) {
               var3.W(var4, 1);
            } else {
               var3.S(var4);
            }

            var5.u(1);
            if(var1.y().B()) {
               var1.e(var5);
            } else {
               var1.y().A(1);
            }
         }
      }

   }

   private boolean y() {
      net.r.i var1 = this.A.a8;

      for(int var2 = 0; var2 < this.W.e(); ++var2) {
         ks var3 = this.W.A(var2);
         if(!var3.B()) {
            int var4 = var1.b(var3);
            if(var4 == -1) {
               var4 = var1.o();
            }

            if(var4 == -1) {
               return false;
            }
         }
      }

      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
