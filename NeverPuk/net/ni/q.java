package net.ni;

import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;
import net.xn;
import net.ni.v;
import net.ni.w;
import net.y9.zc;
import net.yz.aq;

public class q extends v {
   private boolean V;
   private boolean q;
   private boolean u;
   private boolean X;
   private final w G = new w() {
      public net.u.j z() {
         return q.this.S;
      }

      public net.u.r A() {
         return new net.u.r((double)q.this.S.t() + 0.5D, (double)q.this.S.h() + 0.5D, (double)q.this.S.y() + 0.5D);
      }

      public net.yv.r T() {
         return q.this.B();
      }

      public void a(String var1) {
         super.a(var1);
         q.this.W();
      }

      public void V() {
         net.yw.n var1 = q.this.J.Z(q.this.S);
         q.this.B().V(q.this.S, var1, var1, 3);
      }

      public int o() {
         return 0;
      }

      public void L(ByteBuf var1) {
         var1.writeInt(q.this.S.t());
         var1.writeInt(q.this.S.h());
         var1.writeInt(q.this.S.y());
      }

      public net.nx.f E() {
         return q.this.J.v();
      }
   };

   public net.nj.f b(net.nj.f var1) {
      super.b(var1);
      this.G.E(var1);
      var1.c("powered", this.S());
      var1.c("conditionMet", this.C());
      var1.c("auto", this.L());
      return var1;
   }

   public void G(net.nj.f var1) {
      super.G(var1);
      this.G.f(var1);
      this.V = var1.i("powered");
      this.u = var1.i("conditionMet");
      this.v(var1.i("auto"));
   }

   @Nullable
   public net.no.k q() {
      if(this.U()) {
         this.y(false);
         net.nj.f var1 = this.b(new net.nj.f());
         return new net.no.k(this.S, 2, var1);
      } else {
         return null;
      }
   }

   public boolean u() {
      return true;
   }

   public w d() {
      return this.G;
   }

   public net.nv.l I() {
      return this.G.c();
   }

   public void N(boolean var1) {
      this.V = var1;
   }

   public boolean S() {
      return this.V;
   }

   public boolean L() {
      return this.q;
   }

   public void v(boolean var1) {
      boolean var2 = this.q;
      this.q = var1;
      if(!this.V && this.J != null && this.I() != q.b.SEQUENCE) {
         net.y9.l var3 = this.a();
         if(var3 instanceof zc) {
            this.B();
            this.J.c(this.S, var3, var3.u(this.J));
         }
      }

   }

   public boolean C() {
      return this.u;
   }

   public boolean B() {
      w.C();
      this.u = true;
      if(this.G()) {
         net.u.j var2 = this.S.C(((aq)this.J.Z(this.S).i(zc.c)).f());
         if(this.J.Z(var2).Q() instanceof zc) {
            v var3 = this.J.L(var2);
            this.u = var3 instanceof q && ((q)var3).d().n() > 0;
         }

         this.u = false;
      }

      return this.u;
   }

   public boolean U() {
      return this.X;
   }

   public void y(boolean var1) {
      this.X = var1;
   }

   public q.b I() {
      net.y9.l var1 = this.a();
      return var1 == net.nb.f.i?q.b.REDSTONE:(var1 == net.nb.f.M?q.b.AUTO:(var1 == net.nb.f.Tc?q.b.SEQUENCE:q.b.REDSTONE));
   }

   public boolean G() {
      net.yw.n var1 = this.J.Z(this.C());
      return var1.Q() instanceof zc && ((Boolean)var1.i(zc.r)).booleanValue();
   }

   public void Q() {
      this.D = null;
      super.Q();
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum b {
      SEQUENCE,
      AUTO,
      REDSTONE;
   }
}
