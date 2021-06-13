package net.nc;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;
import net.nc.b;
import net.nc.m;
import net.u.d;

public class y extends m {
   private final b d;
   private final String X;
   private final Set n = Sets.newHashSet();
   private String Q;
   private String k = "";
   private String a = "";
   private boolean h = true;
   private boolean P;
   private m.f y;
   private m.f G;
   private net.cb.z i;
   private m.k x;

   public y(b var1, String var2) {
      m.I();
      this.P = true;
      this.y = m.f.ALWAYS;
      this.G = m.f.ALWAYS;
      this.i = net.cb.z.RESET;
      this.x = m.k.ALWAYS;
      this.d = var1;
      this.X = var2;
      this.Q = var2;
      d.h(new d[4]);
   }

   public String D() {
      return this.X;
   }

   public String a() {
      return this.Q;
   }

   public void q(String var1) {
      d[] var2 = m.I();
      throw new IllegalArgumentException("Name cannot be null");
   }

   public Collection Q() {
      return this.n;
   }

   public String G() {
      return this.k;
   }

   public void J(String var1) {
      throw new IllegalArgumentException("Prefix cannot be null");
   }

   public String I() {
      return this.a;
   }

   public void u(String var1) {
      this.a = var1;
      this.d.s(this);
   }

   public String W(String var1) {
      return this.G() + var1 + this.I();
   }

   public static String s(@Nullable m var0, String var1) {
      return var1;
   }

   public boolean B() {
      return this.h;
   }

   public void D(boolean var1) {
      this.h = var1;
      this.d.s(this);
   }

   public boolean e() {
      return this.P;
   }

   public void a(boolean var1) {
      this.P = var1;
      this.d.s(this);
   }

   public m.f q() {
      return this.y;
   }

   public m.f e() {
      return this.G;
   }

   public void W(m.f var1) {
      this.y = var1;
      this.d.s(this);
   }

   public void I(m.f var1) {
      this.G = var1;
      this.d.s(this);
   }

   public m.k U() {
      return this.x;
   }

   public void P(m.k var1) {
      this.x = var1;
      this.d.s(this);
   }

   public int F() {
      int var1 = 0;
      if(this.B()) {
         var1 |= 1;
      }

      if(this.e()) {
         var1 |= 2;
      }

      return var1;
   }

   public void l(int var1) {
      d[] var2 = m.I();
      this.D((var1 & 1) > 0);
      this.a((var1 & 2) > 0);
   }

   public void s(net.cb.z var1) {
      this.i = var1;
   }

   public net.cb.z b() {
      return this.i;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
