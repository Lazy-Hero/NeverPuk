package net.y4;

import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import net.xn;
import net.y4.p;
import net.y4.v;
import net.yz.aq;
import net.yz.ax;

public abstract class c extends p {
   private static final net.yj.y A = new net.yj.y();
   protected net.yj.f v;
   protected net.yj.y f;
   protected net.u.j l;

   public c() {
      this.f = A.P(true).k(net.nb.f.ou);
   }

   public c(int var1) {
      super(var1);
      this.f = A.P(true).k(net.nb.f.ou);
   }

   protected void g(net.yj.f var1, net.u.j var2, net.yj.y var3) {
      this.v = var1;
      this.n(aq.NORTH);
      this.l = var2;
      this.f = var3;
      this.U();
   }

   protected void x(net.nj.f var1) {
      var1.r("TPX", this.l.t());
      var1.r("TPY", this.l.h());
      var1.r("TPZ", this.l.y());
   }

   protected void a(net.nj.f var1, net.yj.e var2) {
      this.l = new net.u.j(var1.P("TPX"), var1.P("TPY"), var1.P("TPZ"));
   }

   public boolean Q(net.yv.r var1, Random var2, v var3) {
      this.f.X(var3);
      this.v.b(var1, this.l, this.f, 18);
      Map var4 = this.v.U(this.l, this.f);

      for(Entry var6 : var4.entrySet()) {
         String var7 = (String)var6.getValue();
         this.B(var7, (net.u.j)var6.getKey(), var1, var2, var3);
      }

      return true;
   }

   protected abstract void B(String var1, net.u.j var2, net.yv.r var3, Random var4, v var5);

   private void U() {
      p.d();
      net.yz.l var2 = this.f.L();
      net.u.j var3 = this.v.e(var2);
      ax var4 = this.f.O();
      this.w = new v(0, 0, 0, var3.t(), var3.h() - 1, var3.y());
      switch(null.a[var2.ordinal()]) {
      case 1:
      default:
      case 2:
         this.w.D(-var3.t(), 0, 0);
      case 3:
         this.w.D(0, 0, -var3.y());
      case 4:
         this.w.D(-var3.t(), 0, -var3.y());
         switch(null.n[var4.ordinal()]) {
         case 1:
         default:
         case 2:
            net.u.j var5 = net.u.j.V;
            if(var2 != net.yz.l.CLOCKWISE_90 && var2 != net.yz.l.COUNTERCLOCKWISE_90) {
               if(var2 == net.yz.l.CLOCKWISE_180) {
                  var5 = var5.a(aq.EAST, var3.t());
               }

               var5 = var5.a(aq.WEST, var3.t());
            }

            var5 = var5.a(var2.d(aq.WEST), var3.y());
            this.w.D(var5.t(), 0, var5.y());
         case 3:
            net.u.j var6 = net.u.j.V;
            if(var2 != net.yz.l.CLOCKWISE_90 && var2 != net.yz.l.COUNTERCLOCKWISE_90) {
               if(var2 == net.yz.l.CLOCKWISE_180) {
                  var6 = var6.a(aq.SOUTH, var3.y());
               }

               var6 = var6.a(aq.NORTH, var3.y());
            }

            var6 = var6.a(var2.d(aq.NORTH), var3.t());
            this.w.D(var6.t(), 0, var6.y());
            this.w.D(this.l.t(), this.l.h(), this.l.y());
         }
      }
   }

   public void g(int var1, int var2, int var3) {
      super.g(var1, var2, var3);
      this.l = this.l.F(var1, var2, var3);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
