package net.cl;

import net.xn;
import net.cb.h;
import net.cb.t;
import net.cl.e;
import net.cl.p;
import net.cl.r;
import net.nd.x;
import net.u.d;
import net.yv.o9;
import net.yz.ab;
import net.yz.m;

public class z implements r {
   private static final t H = new h("tutorial.move.title", new Object[]{e.n("forward"), e.n("left"), e.n("back"), e.n("right")});
   private static final t n = new h("tutorial.move.description", new Object[]{e.n("jump")});
   private static final t Q = new h("tutorial.look.title", new Object[0]);
   private static final t B = new h("tutorial.look.description", new Object[0]);
   private final e y;
   private x r;
   private x A;
   private int a;
   private int Y;
   private int L;
   private boolean W;
   private boolean w;
   private int D = -1;
   private int t = -1;

   public z(e var1) {
      this.y = var1;
   }

   public void e() {
      e.j();
      ++this.a;
      if(this.W) {
         ++this.Y;
         this.W = false;
      }

      if(this.w) {
         ++this.L;
         this.w = false;
      }

      if(this.D == -1 && this.Y > 40) {
         if(this.r != null) {
            this.r.B();
            this.r = null;
         }

         this.D = this.a;
      }

      if(this.t == -1 && this.L > 40) {
         if(this.A != null) {
            this.A.B();
            this.A = null;
         }

         this.t = this.a;
      }

      if(this.D != -1 && this.t != -1) {
         if(this.y.y() == o9.SURVIVAL) {
            this.y.x(p.FIND_TREE);
            d.h(new d[5]);
         }

         this.y.x(p.NONE);
      }

      if(this.r != null) {
         this.r.D((float)this.Y / 40.0F);
      }

      if(this.A != null) {
         this.A.D((float)this.L / 40.0F);
      }

      if(this.a >= 100) {
         if(this.D == -1 && this.r == null) {
            this.r = new x(x.d.MOVEMENT_KEYS, H, n, true);
            this.y.U().J().a(this.r);
         }

         if(this.D != -1 && this.a - this.D >= 20 && this.t == -1 && this.A == null) {
            this.A = new x(x.d.MOUSE, Q, B, true);
            this.y.U().J().a(this.A);
         }
      }

   }

   public void A() {
      if(this.r != null) {
         this.r.B();
         this.r = null;
      }

      if(this.A != null) {
         this.A.B();
         this.A = null;
      }

   }

   public void v(m var1) {
      if(var1.g || var1.s || var1.c || var1.O || var1.d) {
         this.W = true;
      }

   }

   public void J(ab var1) {
      if((double)net.u.t.l(var1.c) > 0.01D || (double)net.u.t.l(var1.Q) > 0.01D) {
         this.w = true;
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
