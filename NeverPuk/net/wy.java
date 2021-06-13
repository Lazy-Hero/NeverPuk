package net;

import java.util.Properties;
import net.m1;
import net.mf;
import net.xn;

public class wy {
   private final String q;
   private final net.yz.m_[] H;
   private int T;
   private int t;
   private int R;
   private int g;
   private int N;
   private int L;
   private int n;
   private int i;

   public wy(String var1, Properties var2) {
      mf.O();
      super();
      this.T = 1;
      this.t = 64;
      this.R = 3;
      this.g = 3;
      this.N = -2130706433;
      this.L = 16777215;
      this.n = 0;
      this.i = Integer.MIN_VALUE;
      m1 var4 = new m1("CustomPanorama");
      this.q = var1;
      this.H = new net.yz.m_[6];
      int var5 = 0;
      if(var5 < this.H.length) {
         this.H[var5] = new net.yz.m_(var1 + "/panorama_" + var5 + ".png");
         ++var5;
      }

      this.T = var4.y(var2.getProperty("weight"), 1);
      this.t = var4.y(var2.getProperty("blur1"), 64);
      this.R = var4.y(var2.getProperty("blur2"), 3);
      this.g = var4.y(var2.getProperty("blur3"), 3);
      this.N = m1.W(var2.getProperty("overlay1.top"), -2130706433);
      this.L = m1.W(var2.getProperty("overlay1.bottom"), 16777215);
      this.n = m1.W(var2.getProperty("overlay2.top"), 0);
      this.i = m1.W(var2.getProperty("overlay2.bottom"), Integer.MIN_VALUE);
   }

   public net.yz.m_[] o() {
      return this.H;
   }

   public int A() {
      return this.T;
   }

   public int o() {
      return this.t;
   }

   public int k() {
      return this.R;
   }

   public int X() {
      return this.g;
   }

   public int J() {
      return this.N;
   }

   public int S() {
      return this.L;
   }

   public int a() {
      return this.n;
   }

   public int e() {
      return this.i;
   }

   public String toString() {
      return "" + this.q + ", weight: " + this.T + ", blur: " + this.t + " " + this.R + " " + this.g + ", overlay: " + this.N + " " + this.L + " " + this.n + " " + this.i;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
