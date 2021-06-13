package net.ct;

import com.mojang.util.UUIDTypeAdapter;
import java.util.List;
import net.xn;
import net.ct.g;
import net.ct.i;
import net.ct.u;
import net.n0.ks;
import net.yz.m_;
import net.z.tu;
import net.z.ww;

public class t {
   public static final int J = 8;
   public static final int A = 8;
   public static final int e = 8;
   public static final int B = 8;
   public static final int E = 40;
   public static final int P = 8;
   public static final int u = 8;
   public static final int n = 8;
   public static final int i = 64;
   public static final int k = 64;
   protected net.nn.j w;
   public int T;
   public int q;
   private final ww D = new ww(this);
   private static int G;

   public ww o() {
      return this.D;
   }

   public void G() {
   }

   public void r(net.nn.j var1, int var2, int var3) {
   }

   public void m(String var1, int var2, int var3, int var4) {
      this.D.t(var1, var2, var3, var4);
   }

   public void u(String var1, int var2, int var3, int var4) {
      this.P(var1, var2, var3, var4, true);
   }

   public void P(String var1, int var2, int var3, int var4, boolean var5) {
      this.D.K(var1, var2, var3, var4, false);
   }

   public void J(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.D.g(var1, var2, var3, var4, var5, var6);
   }

   public static void F(int var0, int var1, float var2, float var3, int var4, int var5, int var6, int var7, float var8, float var9) {
      net.z.g.v(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public static void x(int var0, int var1, float var2, float var3, int var4, int var5, float var6, float var7) {
      net.z.g.r((float)var0, (float)var1, var2, var3, (float)var4, (float)var5, var6, var7);
   }

   public void z(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.D.E(var1, var2, var3, var4, var5, var6);
   }

   public void p() {
      this.D.C();
   }

   public boolean P() {
      return this.D.b();
   }

   public void Z(int var1) {
      this.D.j(var1);
   }

   public void p(int var1, int var2, float var3) {
      j();
      int var5 = 0;
      if(var5 < this.D.q().size()) {
         ((i)this.D.q().get(var5)).Q(var1, var2, var3);
         ++var5;
      }

   }

   public void G(ks var1, int var2, int var3) {
      this.D.C(var1, var2, var3);
   }

   public void y(String var1, int var2, int var3) {
      this.D.B(var1, var2, var3);
   }

   public void p(List var1, int var2, int var3) {
      this.D.U(var1, var2, var3);
   }

   public static void a(String var0, String var1) {
      K();
      m_ var3 = net.yy.f.m(var1);
      if(var3 == null) {
         var3 = net.c9.y.l(UUIDTypeAdapter.fromString(var0));
      }

      net.yy.f.e(var3, var1);
      net.nn.j.b().n().E(var3);
   }

   public static void k(String var0) {
      m_ var1 = new m_(var0);
      net.nn.j.b().n().E(var1);
   }

   public void y() {
   }

   public int W() {
      return tu.q;
   }

   public int v() {
      return tu.V;
   }

   public int e() {
      return this.D.c();
   }

   public int V(String var1) {
      return this.D.B(var1);
   }

   public void n(String var1, int var2, int var3, int var4) {
      this.D.u(var1, var2, var3, var4);
   }

   public List Z(String var1, int var2) {
      return this.D.U(var1, var2);
   }

   public void J(i var1) {
   }

   public static i M(int var0, int var1, int var2, String var3) {
      return new i(var0, var1, var2, var3);
   }

   public static i M(int var0, int var1, int var2, int var3, int var4, String var5) {
      return new i(var0, var1, var2, var3, var4, var5);
   }

   public void I() {
      this.D.M();
   }

   public void N(i var1) {
      this.D.G(var1);
   }

   public List p() {
      return this.D.q();
   }

   public void A(i var1) {
      this.D.f(var1);
   }

   public u g(int var1, int var2, int var3, int var4, int var5) {
      return new u(var1, var2, var3, var4, var5);
   }

   public void O(int var1, int var2, int var3) {
   }

   public void Z() {
   }

   public void O() {
   }

   public void S(int var1, int var2, int var3) {
   }

   public void q(int var1, int var2, int var3, long var4) {
   }

   public void s(char var1, int var2) {
   }

   public void U(boolean var1, int var2) {
   }

   public static String x(String var0) {
      return net.c9.b.x(var0, new Object[0]);
   }

   public static String r(String var0, Object... var1) {
      return net.c9.b.x(var0, var1);
   }

   public g h() {
      return new g(net.nn.j.b().l());
   }

   public void r() {
   }

   public static void s(int var0) {
      G = var0;
   }

   public static int K() {
      return G;
   }

   public static int j() {
      int var0 = K();
      return 51;
   }

   private static xn b(xn var0) {
      return var0;
   }

   static {
      if(K() == 0) {
         s(19);
      }

   }
}
