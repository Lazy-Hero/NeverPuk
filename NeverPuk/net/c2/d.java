package net.c2;

import com.google.common.collect.Lists;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import net.c2.j;
import net.ni.sl;
import net.yz.a3;
import net.yz.ax;
import net.yz.l;
import net.z.tu;
import net.z.wd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class d extends tu {
   private static final Logger K = LogManager.getLogger();
   public static final int[] r = new int[]{203, 205, 14, 211, 199, 207};
   private final sl I;
   private ax o = ax.NONE;
   private l l = l.NONE;
   private sl.s n = sl.s.DATA;
   private boolean Z;
   private boolean Y;
   private boolean f;
   private wd D;
   private wd a;
   private wd Q;
   private wd b_;
   private wd z;
   private wd s;
   private wd T;
   private wd y;
   private wd S;
   private wd H;
   private net.z.m U;
   private net.z.m b;
   private net.z.m bU;
   private net.z.m p;
   private net.z.m B;
   private net.z.m w;
   private net.z.m bv;
   private net.z.m u;
   private net.z.m b5;
   private net.z.m F;
   private net.z.m R;
   private net.z.m bl;
   private net.z.m W;
   private net.z.m bo;
   private final List b7 = Lists.newArrayList();
   private final DecimalFormat J = new DecimalFormat("0.0###");

   public d(sl var1) {
      this.I = var1;
      this.J.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.US));
   }

   public void K() {
      this.D.K();
      this.a.K();
      this.Q.K();
      this.b_.K();
      this.z.K();
      this.s.K();
      this.T.K();
      this.y.K();
      this.S.K();
      this.H.K();
   }

   public void L() {
      Keyboard.enableRepeatEvents(true);
      this.m.clear();
      this.U = this.x(new net.z.m(0, q / 2 - 4 - 150, 210, 150, 20, net.c9.b.x("gui.done", new Object[0])));
      this.b = this.x(new net.z.m(1, q / 2 + 4, 210, 150, 20, net.c9.b.x("gui.cancel", new Object[0])));
      this.bU = this.x(new net.z.m(9, q / 2 + 4 + 100, 185, 50, 20, net.c9.b.x("structure_block.button.save", new Object[0])));
      this.p = this.x(new net.z.m(10, q / 2 + 4 + 100, 185, 50, 20, net.c9.b.x("structure_block.button.load", new Object[0])));
      this.b5 = this.x(new net.z.m(18, q / 2 - 4 - 150, 185, 50, 20, "MODE"));
      j.u.g();
      this.F = this.x(new net.z.m(19, q / 2 + 4 + 100, 120, 50, 20, net.c9.b.x("structure_block.button.detect_size", new Object[0])));
      this.R = this.x(new net.z.m(20, q / 2 + 4 + 100, 160, 50, 20, "ENTITIES"));
      this.bl = this.x(new net.z.m(21, q / 2 - 20, 185, 40, 20, "MIRROR"));
      this.W = this.x(new net.z.m(22, q / 2 + 4 + 100, 80, 50, 20, "SHOWAIR"));
      this.bo = this.x(new net.z.m(23, q / 2 + 4 + 100, 80, 50, 20, "SHOWBB"));
      this.B = this.x(new net.z.m(11, q / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20, "0"));
      this.w = this.x(new net.z.m(12, q / 2 - 1 - 40 - 20, 185, 40, 20, "90"));
      this.bv = this.x(new net.z.m(13, q / 2 + 1 + 20, 185, 40, 20, "180"));
      this.u = this.x(new net.z.m(14, q / 2 + 1 + 40 + 1 + 20, 185, 40, 20, "270"));
      this.D = new wd(2, this.O, q / 2 - 152, 40, 300, 20);
      this.D.r(64);
      this.D.u(this.I.O());
      this.b7.add(this.D);
      net.u.j var2 = this.I.g();
      this.a = new wd(3, this.O, q / 2 - 152, 80, 80, 20);
      this.a.r(15);
      this.a.u(Integer.toString(var2.t()));
      this.b7.add(this.a);
      this.Q = new wd(4, this.O, q / 2 - 72, 80, 80, 20);
      this.Q.r(15);
      this.Q.u(Integer.toString(var2.h()));
      this.b7.add(this.Q);
      this.b_ = new wd(5, this.O, q / 2 + 8, 80, 80, 20);
      this.b_.r(15);
      this.b_.u(Integer.toString(var2.y()));
      this.b7.add(this.b_);
      net.u.j var3 = this.I.y();
      this.z = new wd(6, this.O, q / 2 - 152, 120, 80, 20);
      this.z.r(15);
      this.z.u(Integer.toString(var3.t()));
      this.b7.add(this.z);
      this.s = new wd(7, this.O, q / 2 - 72, 120, 80, 20);
      this.s.r(15);
      this.s.u(Integer.toString(var3.h()));
      this.b7.add(this.s);
      this.T = new wd(8, this.O, q / 2 + 8, 120, 80, 20);
      this.T.r(15);
      this.T.u(Integer.toString(var3.y()));
      this.b7.add(this.T);
      this.y = new wd(15, this.O, q / 2 - 152, 120, 80, 20);
      this.y.r(15);
      this.y.u(this.J.format((double)this.I.p()));
      this.b7.add(this.y);
      this.S = new wd(16, this.O, q / 2 - 72, 120, 80, 20);
      this.S.r(31);
      this.S.u(Long.toString(this.I.f()));
      this.b7.add(this.S);
      this.H = new wd(17, this.O, q / 2 - 152, 120, 240, 20);
      this.H.r(128);
      this.H.u(this.I.J());
      this.b7.add(this.H);
      this.o = this.I.G();
      this.z();
      this.l = this.I.A();
      this.H();
      this.n = this.I.x();
      this.O();
      this.Z = this.I.F();
      this.G();
      this.Y = this.I.l();
      this.r();
      this.f = this.I.L();
      this.e();
      net.u.d.h(new net.u.d[3]);
   }

   public void x() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void t(net.z.m var1) throws IOException {
      if(var1.O) {
         if(var1.g == 1) {
            this.I.C(this.o);
            this.I.t(this.l);
            this.I.m(this.n);
            this.I.i(this.Z);
            this.I.D(this.Y);
            this.I.V(this.f);
            this.A.s((tu)null);
         } else if(var1.g == 0) {
            if(this.w(1)) {
               this.A.s((tu)null);
            }
         } else if(var1.g == 9) {
            if(this.I.x() == sl.s.SAVE) {
               this.w(2);
               this.A.s((tu)null);
            }
         } else if(var1.g == 10) {
            if(this.I.x() == sl.s.LOAD) {
               this.w(3);
               this.A.s((tu)null);
            }
         } else if(var1.g == 11) {
            this.I.t(l.NONE);
            this.H();
         } else if(var1.g == 12) {
            this.I.t(l.CLOCKWISE_90);
            this.H();
         } else if(var1.g == 13) {
            this.I.t(l.CLOCKWISE_180);
            this.H();
         } else if(var1.g == 14) {
            this.I.t(l.COUNTERCLOCKWISE_90);
            this.H();
         } else if(var1.g == 18) {
            this.I.g();
            this.O();
         } else if(var1.g == 19) {
            if(this.I.x() == sl.s.SAVE) {
               this.w(4);
               this.A.s((tu)null);
            }
         } else if(var1.g == 20) {
            this.I.i(!this.I.F());
            this.G();
         } else if(var1.g == 22) {
            this.I.D(!this.I.l());
            this.r();
         } else if(var1.g == 23) {
            this.I.V(!this.I.L());
            this.e();
         } else if(var1.g == 21) {
            switch(null.M[this.I.G().ordinal()]) {
            case 1:
               this.I.C(ax.LEFT_RIGHT);
               break;
            case 2:
               this.I.C(ax.FRONT_BACK);
               break;
            case 3:
               this.I.C(ax.NONE);
            }

            this.z();
         }
      }

   }

   private void G() {
      boolean var1 = !this.I.F();
      this.R.J = net.c9.b.x("options.on", new Object[0]);
   }

   private void r() {
      boolean var1 = this.I.l();
      this.W.J = net.c9.b.x("options.on", new Object[0]);
   }

   private void e() {
      boolean var1 = this.I.L();
      this.bo.J = net.c9.b.x("options.on", new Object[0]);
   }

   private void z() {
      ax var1 = this.I.G();
      switch(null.M[var1.ordinal()]) {
      case 1:
         this.bl.J = "|";
         break;
      case 2:
         this.bl.J = "< >";
         break;
      case 3:
         this.bl.J = "^ v";
      }

   }

   private void H() {
      this.B.O = true;
      this.w.O = true;
      this.bv.O = true;
      this.u.O = true;
      switch(null.i[this.I.A().ordinal()]) {
      case 1:
         this.B.O = false;
         break;
      case 2:
         this.bv.O = false;
         break;
      case 3:
         this.u.O = false;
         break;
      case 4:
         this.w.O = false;
      }

   }

   private void O() {
      j.u.g();
      this.D.n(false);
      this.a.n(false);
      this.Q.n(false);
      this.b_.n(false);
      this.z.n(false);
      this.s.n(false);
      this.T.n(false);
      this.y.n(false);
      this.S.n(false);
      this.H.n(false);
      this.D.l(false);
      this.D.n(false);
      this.a.l(false);
      this.Q.l(false);
      this.b_.l(false);
      this.z.l(false);
      this.s.l(false);
      this.T.l(false);
      this.y.l(false);
      this.S.l(false);
      this.H.l(false);
      this.bU.F = false;
      this.p.F = false;
      this.F.F = false;
      this.R.F = false;
      this.bl.F = false;
      this.B.F = false;
      this.w.F = false;
      this.bv.F = false;
      this.u.F = false;
      this.W.F = false;
      this.bo.F = false;
      switch(null.f[this.I.x().ordinal()]) {
      case 1:
         this.D.l(true);
         this.D.n(true);
         this.a.l(true);
         this.Q.l(true);
         this.b_.l(true);
         this.z.l(true);
         this.s.l(true);
         this.T.l(true);
         this.bU.F = true;
         this.F.F = true;
         this.R.F = true;
         this.W.F = true;
      case 2:
         this.D.l(true);
         this.D.n(true);
         this.a.l(true);
         this.Q.l(true);
         this.b_.l(true);
         this.y.l(true);
         this.S.l(true);
         this.p.F = true;
         this.R.F = true;
         this.bl.F = true;
         this.B.F = true;
         this.w.F = true;
         this.bv.F = true;
         this.u.F = true;
         this.bo.F = true;
         this.H();
      case 3:
         this.D.l(true);
         this.D.n(true);
      case 4:
         this.H.l(true);
         this.H.n(true);
      default:
         this.b5.J = net.c9.b.x("structure_block.mode." + this.I.x().f(), new Object[0]);
      }
   }

   private boolean w(int var1) {
      net.n2.h var2 = new net.n2.h(Unpooled.buffer());
      this.I.E(var2);
      var2.writeByte(var1);
      var2.R(this.I.x().toString());
      var2.R(this.D.u());
      var2.writeInt(this.H(this.a.u()));
      var2.writeInt(this.H(this.Q.u()));
      var2.writeInt(this.H(this.b_.u()));
      var2.writeInt(this.H(this.z.u()));
      var2.writeInt(this.H(this.s.u()));
      var2.writeInt(this.H(this.T.u()));
      var2.R(this.I.G().toString());
      var2.R(this.I.A().toString());
      var2.R(this.H.u());
      var2.writeBoolean(this.I.F());
      var2.writeBoolean(this.I.l());
      var2.writeBoolean(this.I.L());
      var2.writeFloat(this.G(this.y.u()));
      var2.N(this.A(this.S.u()));
      this.A.d().L((net.n2.k)(new net.m.l("MC|Struct", var2)));
      return true;
   }

   private long A(String var1) {
      return Long.valueOf(var1).longValue();
   }

   private float G(String var1) {
      return Float.valueOf(var1).floatValue();
   }

   private int H(String var1) {
      return Integer.parseInt(var1);
   }

   protected void Q(char var1, int var2) throws IOException {
      if(this.D.Q() && l(var1, var2)) {
         this.D.l(var1, var2);
      }

      if(this.a.Q()) {
         this.a.l(var1, var2);
      }

      if(this.Q.Q()) {
         this.Q.l(var1, var2);
      }

      if(this.b_.Q()) {
         this.b_.l(var1, var2);
      }

      if(this.z.Q()) {
         this.z.l(var1, var2);
      }

      if(this.s.Q()) {
         this.s.l(var1, var2);
      }

      if(this.T.Q()) {
         this.T.l(var1, var2);
      }

      if(this.y.Q()) {
         this.y.l(var1, var2);
      }

      if(this.S.Q()) {
         this.S.l(var1, var2);
      }

      if(this.H.Q()) {
         this.H.l(var1, var2);
      }

      if(var2 == 15) {
         wd var3 = null;
         wd var4 = null;

         for(wd var6 : this.b7) {
            if(var6.Q()) {
               var4 = var6;
               break;
            }

            if(var6.Y() && var6.Q()) {
               var3 = var6;
            }
         }

         for(wd var8 : this.b7) {
            if(var8.Q() && var8 != var3) {
               var4 = var8;
               break;
            }
         }

         if(var4 != var3) {
            var3.n(false);
            var4.n(true);
         }
      }

      if(var2 != 28 && var2 != 156) {
         if(var2 == 1) {
            this.t(this.b);
         }
      } else {
         this.t(this.U);
      }

   }

   private static boolean l(char var0, int var1) {
      boolean var2 = true;

      for(int var6 : r) {
         if(var6 == var1) {
            return true;
         }
      }

      for(char var10 : a3.J) {
         if(var10 == var0) {
            var2 = false;
            break;
         }
      }

      return var2;
   }

   protected void C(int var1, int var2, int var3) throws IOException {
      super.C(var1, var2, var3);
      if(this.D.Q()) {
         this.D.N(var1, var2, var3);
      }

      if(this.a.Q()) {
         this.a.N(var1, var2, var3);
      }

      if(this.Q.Q()) {
         this.Q.N(var1, var2, var3);
      }

      if(this.b_.Q()) {
         this.b_.N(var1, var2, var3);
      }

      if(this.z.Q()) {
         this.z.N(var1, var2, var3);
      }

      if(this.s.Q()) {
         this.s.N(var1, var2, var3);
      }

      if(this.T.Q()) {
         this.T.N(var1, var2, var3);
      }

      if(this.y.Q()) {
         this.y.N(var1, var2, var3);
      }

      if(this.S.Q()) {
         this.S.N(var1, var2, var3);
      }

      if(this.H.Q()) {
         this.H.N(var1, var2, var3);
      }

   }

   public void v(int var1, int var2, float var3) {
      this.C();
      sl.s var4 = this.I.x();
      this.d(this.O, net.c9.b.x("tile.structureBlock.name", new Object[0]), q / 2, 10, 16777215);
      if(var4 != sl.s.DATA) {
         this.n(this.O, net.c9.b.x("structure_block.structure_name", new Object[0]), q / 2 - 153, 30, 10526880);
         this.D.Z();
      }

      if(var4 == sl.s.LOAD || var4 == sl.s.SAVE) {
         this.n(this.O, net.c9.b.x("structure_block.position", new Object[0]), q / 2 - 153, 70, 10526880);
         this.a.Z();
         this.Q.Z();
         this.b_.Z();
         String var5 = net.c9.b.x("structure_block.include_entities", new Object[0]);
         int var6 = this.O.r(var5);
         this.n(this.O, var5, q / 2 + 154 - var6, 150, 10526880);
      }

      if(var4 == sl.s.SAVE) {
         this.n(this.O, net.c9.b.x("structure_block.size", new Object[0]), q / 2 - 153, 110, 10526880);
         this.z.Z();
         this.s.Z();
         this.T.Z();
         String var9 = net.c9.b.x("structure_block.detect_size", new Object[0]);
         int var12 = this.O.r(var9);
         this.n(this.O, var9, q / 2 + 154 - var12, 110, 10526880);
         String var7 = net.c9.b.x("structure_block.show_air", new Object[0]);
         int var8 = this.O.r(var7);
         this.n(this.O, var7, q / 2 + 154 - var8, 70, 10526880);
      }

      if(var4 == sl.s.LOAD) {
         this.n(this.O, net.c9.b.x("structure_block.integrity", new Object[0]), q / 2 - 153, 110, 10526880);
         this.y.Z();
         this.S.Z();
         String var10 = net.c9.b.x("structure_block.show_boundingbox", new Object[0]);
         int var13 = this.O.r(var10);
         this.n(this.O, var10, q / 2 + 154 - var13, 70, 10526880);
      }

      if(var4 == sl.s.DATA) {
         this.n(this.O, net.c9.b.x("structure_block.custom_data", new Object[0]), q / 2 - 153, 110, 10526880);
         this.H.Z();
      }

      String var11 = "structure_block.mode_info." + var4.f();
      this.n(this.O, net.c9.b.x(var11, new Object[0]), q / 2 - 153, 174, 10526880);
      super.v(var1, var2, var3);
   }

   public boolean b() {
      return false;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
