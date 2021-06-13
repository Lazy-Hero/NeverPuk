package net.z;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.Map.Entry;
import net.z.g;
import net.z.h;
import net.z.m;
import net.z.tu;

public class wl extends tu {
   private final tu R;
   private final net.nr.d b;
   private final List u = Lists.newArrayList();
   private final List S = Lists.newArrayList();
   private String z;
   private String[] H;
   private wl.x r;
   private m f;

   public wl(tu var1, net.nr.d var2) {
      this.R = var1;
      this.b = var2;
   }

   public void L() {
      g.B();
      this.z = net.c9.b.x("options.snooper.title", new Object[0]);
      String var2 = net.c9.b.x("options.snooper.desc", new Object[0]);
      ArrayList var3 = Lists.newArrayList();
      Iterator var4 = this.O.m(var2, q - 30).iterator();
      if(var4.hasNext()) {
         String var5 = (String)var4.next();
         var3.add(var5);
      }

      this.H = (String[])var3.toArray(new String[var3.size()]);
      this.u.clear();
      this.S.clear();
      this.f = this.x(new m(1, q / 2 - 152, V - 30, 150, 20, this.b.L(net.nr.d.SNOOPER_ENABLED)));
      this.m.add(new m(2, q / 2 + 2, V - 30, 150, 20, net.c9.b.x("gui.done", new Object[0])));
      boolean var7 = this.A.V() != null && this.A.V().S() != null;
      Iterator var8 = (new TreeMap(this.A.e().P())).entrySet().iterator();
      if(var8.hasNext()) {
         Entry var6 = (Entry)var8.next();
         this.u.add("C " + (String)var6.getKey());
         this.S.add(this.O.Q((String)var6.getValue(), q - 220));
      }

      var8 = (new TreeMap(this.A.V().S().P())).entrySet().iterator();
      if(var8.hasNext()) {
         Entry var10 = (Entry)var8.next();
         this.u.add("S " + (String)var10.getKey());
         this.S.add(this.O.Q((String)var10.getValue(), q - 220));
      }

      this.r = new wl.x();
   }

   public void m() throws IOException {
      super.m();
      this.r.q();
   }

   protected void t(m var1) throws IOException {
      if(var1.O) {
         if(var1.g == 2) {
            this.b.m();
            this.b.m();
            this.A.s(this.R);
         }

         if(var1.g == 1) {
            this.b.T(net.nr.d.SNOOPER_ENABLED, 1);
            this.f.J = this.b.L(net.nr.d.SNOOPER_ENABLED);
         }
      }

   }

   public void v(int var1, int var2, float var3) {
      this.C();
      this.r.Z(var1, var2, var3);
      this.d(this.O, this.z, q / 2, 8, 16777215);
      int var4 = 22;

      for(String var8 : this.H) {
         this.d(this.O, var8, q / 2, var4, 8421504);
         var4 += this.O.R;
      }

      super.v(var1, var2, var3);
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   class x extends h {
      public x() {
         super(wl.this.A, tu.q, tu.V, 80, tu.V - 40, wl.this.O.R + 1);
      }

      protected int V() {
         return wl.this.u.size();
      }

      protected void E(int var1, boolean var2, int var3, int var4) {
      }

      protected boolean z(int var1) {
         return false;
      }

      protected void x() {
      }

      protected void x(int var1, int var2, int var3, int var4, int var5, int var6, float var7) {
         wl.this.O.v((String)wl.this.u.get(var1), 10.0F, (float)var3, 16777215);
         wl.this.O.v((String)wl.this.S.get(var1), 230.0F, (float)var3, 16777215);
      }

      protected int I() {
         return this.x - 10;
      }
   }
}
