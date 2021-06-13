package net.z;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.n0.ks;
import net.y.u1;
import net.z.f;
import net.z.g;
import net.z.m;
import net.z.r;
import net.z.t_;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public abstract class tu extends g implements f {
   private static final Logger h = LogManager.getLogger();
   private static final Set j = Sets.newHashSet(new String[]{"http", "https"});
   private static final Splitter L = Splitter.on('\n');
   protected ArrayList X = new ArrayList();
   protected net.nn.j A;
   protected net.y.t t;
   public static int q;
   public static int V;
   protected List m = Lists.newArrayList();
   protected List c = Lists.newArrayList();
   public boolean E;
   protected r O;
   protected m C;
   public int P;
   private long N;
   private int k;
   private URI g;
   private boolean M;
   private static boolean i;

   public void v(int var1, int var2, float var3) {
      for(int var4 = 0; var4 < this.m.size(); ++var4) {
         ((m)this.m.get(var4)).Z(this.A, var1, var2, var3);
      }

      for(int var5 = 0; var5 < this.c.size(); ++var5) {
         ((t_)this.c.get(var5)).r(this.A, var1, var2);
      }

   }

   protected void Q(char var1, int var2) throws IOException {
      if(var2 == 1) {
         this.A.s((tu)null);
         if(this.A.s5 == null) {
            this.A.p();
         }
      }

   }

   protected m x(m var1) {
      this.m.add(var1);
      return var1;
   }

   public static String s() {
      Transferable var0 = Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object)null);
      return var0.isDataFlavorSupported(DataFlavor.stringFlavor)?(String)var0.getTransferData(DataFlavor.stringFlavor):"";
   }

   public static void G(String var0) {
      if(!StringUtils.isEmpty(var0)) {
         StringSelection var1 = new StringSelection(var0);
         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(var1, (ClipboardOwner)null);
      }

   }

   protected void C(ks var1, int var2, int var3) {
      this.U(this.z(var1), var2, var3);
   }

   public List z(ks var1) {
      List var2 = var1.G(this.A.sf, this.A.T.p?net.yf.f.ADVANCED:net.yf.f.NORMAL);

      for(int var3 = 0; var3 < var2.size(); ++var3) {
         var2.set(var3, var1.p().rarityColor + (String)var2.get(var3));
      }

      return var2;
   }

   public void B(String var1, int var2, int var3) {
      this.U(Arrays.asList(new String[]{var1}), var2, var3);
   }

   public void l(boolean var1) {
      this.M = var1;
   }

   public boolean W() {
      return this.M;
   }

   public void U(List var1, int var2, int var3) {
      boolean var4 = g.C();
      if(!var1.isEmpty()) {
         net.y.d.g();
         u1.m();
         net.y.d.i();
         net.y.d.z();
         int var5 = 0;
         Iterator var6 = var1.iterator();
         if(var6.hasNext()) {
            String var7 = (String)var6.next();
            int var8 = this.O.r(var7);
            if(var8 > var5) {
               var5 = var8;
            }
         }

         int var14 = var2 + 12;
         int var15 = var3 - 12;
         int var18 = 8;
         if(var1.size() > 1) {
            var18 += 2 + (var1.size() - 1) * 10;
         }

         if(var14 + var5 > q) {
            var14 -= 28 + var5;
         }

         if(var15 + var18 + 6 > V) {
            var15 = V - var18 - 6;
         }

         d = 300.0F;
         this.t.t = 300.0F;
         int var10000 = -267386864;
         this.T(var14 - 3, var15 - 4, (double)(var14 + var5 + 3), (double)(var15 - 3), -267386864, -267386864);
         this.T(var14 - 3, var15 + var18 + 3, (double)(var14 + var5 + 3), (double)(var15 + var18 + 4), -267386864, -267386864);
         this.T(var14 - 3, var15 - 3, (double)(var14 + var5 + 3), (double)(var15 + var18 + 3), -267386864, -267386864);
         this.T(var14 - 4, var15 - 3, (double)(var14 - 3), (double)(var15 + var18 + 3), -267386864, -267386864);
         this.T(var14 + var5 + 3, var15 - 3, (double)(var14 + var5 + 4), (double)(var15 + var18 + 3), -267386864, -267386864);
         var10000 = 1347420415;
         var10000 = 1344798847;
         this.T(var14 - 3, var15 - 3 + 1, (double)(var14 - 3 + 1), (double)(var15 + var18 + 3 - 1), 1347420415, 1344798847);
         this.T(var14 + var5 + 2, var15 - 3 + 1, (double)(var14 + var5 + 3), (double)(var15 + var18 + 3 - 1), 1347420415, 1344798847);
         this.T(var14 - 3, var15 - 3, (double)(var14 + var5 + 3), (double)(var15 - 3 + 1), 1347420415, 1347420415);
         this.T(var14 - 3, var15 + var18 + 2, (double)(var14 + var5 + 3), (double)(var15 + var18 + 3), 1344798847, 1344798847);
         int var12 = 0;
         if(var12 < var1.size()) {
            String var13 = (String)var1.get(var12);
            this.O.U(var13, (float)var14, (float)var15, -1);
            var15 = var15 + 2;
            var15 = var15 + 10;
            ++var12;
         }

         d = 0.0F;
         this.t.t = 0.0F;
         net.y.d.K();
         net.y.d.B();
         u1.B();
         net.y.d.F();
      }

   }

   protected void Z(net.cb.t var1, int var2, int var3) {
      if(var1.E().W() != null) {
         net.n6.o var4 = var1.E().W();
         if(var4.z() == net.n6.o.SHOW_ITEM) {
            ks var5 = ks.a;
            net.nj.f var6 = net.nj.g.c(var4.g().l());
            if(var6 instanceof net.nj.f) {
               var5 = new ks((net.nj.f)var6);
            }

            if(var5.B()) {
               this.B(net.cb.z.RED + "Invalid Item!", var2, var3);
            } else {
               this.C(var5, var2, var3);
            }
         } else if(var4.z() == net.n6.o.SHOW_ENTITY) {
            if(this.A.T.p) {
               net.nj.f var8 = net.nj.g.c(var4.g().l());
               ArrayList var9 = Lists.newArrayList();
               var9.add(var8.J("name"));
               if(var8.K("type", 8)) {
                  String var7 = var8.J("type");
                  var9.add("Type: " + var7);
               }

               var9.add(var8.J("id"));
               this.U(var9, var2, var3);
            }
         } else if(var4.z() == net.n6.o.SHOW_TEXT) {
            this.U(this.A.sO.m(var4.g().c(), Math.max(q / 2, 200)), var2, var3);
         }

         net.y.d.i();
      }

   }

   protected void w(String var1, boolean var2) {
   }

   public boolean e(net.cb.t var1) {
      return false;
   }

   public void B(String var1) {
      this.U(var1, true);
   }

   public void U(String var1, boolean var2) {
      this.A.y.I().I(var1);
      this.A.sf.f(var1);
   }

   protected void C(int var1, int var2, int var3) throws IOException {
      for(int var4 = 0; var4 < this.m.size(); ++var4) {
         m var5 = (m)this.m.get(var4);
         if(var5.X(this.A, var1, var2)) {
            this.C = var5;
            var5.i(this.A.n());
            this.t(var5);
         }
      }

   }

   protected void E(int var1, int var2, int var3) {
      if(this.C != null) {
         this.C.A(var1, var2);
         this.C = null;
      }

   }

   protected void f(int var1, int var2, int var3, long var4) {
   }

   protected void t(m var1) throws IOException {
   }

   public void b(net.nn.j var1, int var2, int var3) {
      this.A = var1;
      this.t = var1.K();
      this.O = var1.sO;
      q = var2;
      V = var3;
      this.m.clear();
      this.L();
   }

   public void P(int var1, int var2) {
      q = var1;
      V = var2;
   }

   public void L() {
   }

   public void l() throws IOException {
      if(Mouse.isCreated()) {
         while(Mouse.next()) {
            this.m();
         }
      }

      if(Keyboard.isCreated()) {
         while(Keyboard.next()) {
            this.I();
         }
      }

   }

   public void m() throws IOException {
      int var1 = Mouse.getEventX() * q / this.A.sB;
      int var2 = V - Mouse.getEventY() * V / this.A.st - 1;
      int var3 = Mouse.getEventButton();
      if(Mouse.getEventButtonState()) {
         if(this.A.T.iI && this.k++ > 0) {
            return;
         }

         this.P = var3;
         this.N = net.nn.j.E();
         this.C(var1, var2, this.P);
      } else if(var3 != -1) {
         if(this.A.T.iI && --this.k > 0) {
            return;
         }

         this.P = -1;
         this.E(var1, var2, var3);
      } else if(this.P != -1 && this.N > 0L) {
         long var4 = net.nn.j.E() - this.N;
         this.f(var1, var2, this.P, var4);
      }

   }

   public void I() throws IOException {
      char var1 = Keyboard.getEventCharacter();
      if(Keyboard.getEventKey() == 0 && var1 >= 32 || Keyboard.getEventKeyState()) {
         this.Q(var1, Keyboard.getEventKey());
      }

      this.A.P();
   }

   public void K() {
   }

   public void x() {
   }

   public void C() {
      this.j(0);
   }

   public void j(int var1) {
      if(this.A.s8 != null) {
         this.T(0, 0, (double)q, (double)V, -1072689136, -804253680);
      } else {
         this.F(var1);
      }

   }

   public void F(int var1) {
      net.y.d.i();
      net.y.d.V();
      net.y.r var2 = net.y.r.f();
      net.y.p var3 = var2.k();
      this.A.n().E(v);
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      float var10000 = 32.0F;
      var3.m(7, net.y8.x.r);
      var3.H(0.0D, (double)V, 0.0D).Y(0.0D, (double)((float)V / 32.0F + (float)var1)).V(64, 64, 64, 255).W();
      var3.H((double)q, (double)V, 0.0D).Y((double)((float)q / 32.0F), (double)((float)V / 32.0F + (float)var1)).V(64, 64, 64, 255).W();
      var3.H((double)q, 0.0D, 0.0D).Y((double)((float)q / 32.0F), (double)var1).V(64, 64, 64, 255).W();
      var3.H(0.0D, 0.0D, 0.0D).Y(0.0D, (double)var1).V(64, 64, 64, 255).W();
      var2.p();
   }

   public boolean b() {
      return true;
   }

   public void y(boolean var1, int var2) {
      if(var2 == 31102009) {
         this.H(this.g);
         this.g = null;
         this.A.s(this);
      }

   }

   private void H(URI var1) {
      Class var2 = Class.forName("java.awt.Desktop");
      Object var3 = var2.getMethod("getDesktop", new Class[0]).invoke((Object)null, new Object[0]);
      var2.getMethod("browse", new Class[]{URI.class}).invoke(var3, new Object[]{var1});
   }

   public static boolean T() {
      return net.nn.j.I?Keyboard.isKeyDown(219) || Keyboard.isKeyDown(220):Keyboard.isKeyDown(29) || Keyboard.isKeyDown(157);
   }

   public static boolean s() {
      return Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54);
   }

   public static boolean I() {
      return Keyboard.isKeyDown(56) || Keyboard.isKeyDown(184);
   }

   public static boolean H(int var0) {
      return var0 == 45 && T() && !s() && !I();
   }

   public static boolean L(int var0) {
      return var0 == 47 && T() && !s() && !I();
   }

   public static boolean S(int var0) {
      return var0 == 46 && T() && !s() && !I();
   }

   public static boolean r(int var0) {
      return var0 == 30 && T() && !s() && !I();
   }

   public void H(net.nn.j var1, int var2, int var3) {
      this.b(var1, var2, var3);
   }

   static {
      Y(false);
   }

   public static void Y(boolean var0) {
      i = var0;
   }

   public static boolean d() {
      return i;
   }

   public static boolean Z() {
      boolean var0 = d();
      return true;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
