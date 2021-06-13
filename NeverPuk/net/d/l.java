package net.d;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import net.xn;
import net.d.t;
import net.d.w;
import net.u.j;
import net.yw.n;

public class l {
   private final w T;
   private final String f;
   private final List a = Lists.newArrayList();
   private StackTraceElement[] O = new StackTraceElement[0];
   private static String G;

   public l(w var1, String var2) {
      this.T = var1;
      this.f = var2;
   }

   public static String J(double var0, double var2, double var4) {
      return String.format("%.2f,%.2f,%.2f - %s", new Object[]{Double.valueOf(var0), Double.valueOf(var2), Double.valueOf(var4), w(new j(var0, var2, var4))});
   }

   public static String w(j var0) {
      return U(var0.t(), var0.h(), var0.y());
   }

   public static String U(int var0, int var1, int var2) {
      StringBuilder var3 = new StringBuilder();
      var3.append(String.format("World: (%d,%d,%d)", new Object[]{Integer.valueOf(var0), Integer.valueOf(var1), Integer.valueOf(var2)}));
      var3.append(", ");
      int var4 = var0 >> 4;
      int var5 = var2 >> 4;
      int var6 = var0 & 15;
      int var7 = var1 >> 4;
      int var8 = var2 & 15;
      int var9 = var4 << 4;
      int var10 = var5 << 4;
      int var11 = (var4 + 1 << 4) - 1;
      int var12 = (var5 + 1 << 4) - 1;
      var3.append(String.format("Chunk: (at %d,%d,%d in %d,%d; contains blocks %d,0,%d to %d,255,%d)", new Object[]{Integer.valueOf(var6), Integer.valueOf(var7), Integer.valueOf(var8), Integer.valueOf(var4), Integer.valueOf(var5), Integer.valueOf(var9), Integer.valueOf(var10), Integer.valueOf(var11), Integer.valueOf(var12)}));
      var3.append(", ");
      var4 = var0 >> 9;
      var5 = var2 >> 9;
      var6 = var4 << 5;
      var7 = var5 << 5;
      var8 = (var4 + 1 << 5) - 1;
      var9 = (var5 + 1 << 5) - 1;
      var10 = var4 << 9;
      var11 = var5 << 9;
      var12 = (var4 + 1 << 9) - 1;
      int var13 = (var5 + 1 << 9) - 1;
      var3.append(String.format("Region: (%d,%d; contains chunks %d,%d to %d,%d, blocks %d,0,%d to %d,255,%d)", new Object[]{Integer.valueOf(var4), Integer.valueOf(var5), Integer.valueOf(var6), Integer.valueOf(var7), Integer.valueOf(var8), Integer.valueOf(var9), Integer.valueOf(var10), Integer.valueOf(var11), Integer.valueOf(var12), Integer.valueOf(var13)}));
      return var3.toString();
   }

   public void L(String var1, t var2) {
      this.e(var1, var2.call());
   }

   public void e(String var1, Object var2) {
      this.a.add(new l.f(var1, var2));
   }

   public void B(String var1, Throwable var2) {
      this.e(var1, var2);
   }

   public int u(int var1) {
      StackTraceElement[] var2 = Thread.currentThread().getStackTrace();
      if(var2.length <= 0) {
         return 0;
      } else {
         this.O = new StackTraceElement[var2.length - 3 - var1];
         System.arraycopy(var2, 3 + var1, this.O, 0, this.O.length);
         return this.O.length;
      }
   }

   public boolean R(StackTraceElement var1, StackTraceElement var2) {
      if(this.O.length != 0) {
         StackTraceElement var3 = this.O[0];
         if(var3.isNativeMethod() == var1.isNativeMethod() && var3.getClassName().equals(var1.getClassName()) && var3.getFileName().equals(var1.getFileName()) && var3.getMethodName().equals(var1.getMethodName())) {
            if(this.O.length > 1) {
               boolean var10000 = true;
            }

            return false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void Z(int var1) {
      StackTraceElement[] var2 = new StackTraceElement[this.O.length - var1];
      System.arraycopy(this.O, 0, var2, 0, var2.length);
      this.O = var2;
   }

   public void C(StringBuilder var1) {
      J();
      var1.append("-- ").append(this.f).append(" --\n");
      var1.append("Details:");
      Iterator var3 = this.a.iterator();
      if(var3.hasNext()) {
         l.f var4 = (l.f)var3.next();
         var1.append("\n\t");
         var1.append(var4.m());
         var1.append(": ");
         var1.append(var4.S());
      }

      if(this.O != null && this.O.length > 0) {
         var1.append("\nStacktrace:");
         StackTraceElement[] var7 = this.O;
         int var8 = var7.length;
         int var5 = 0;
         if(var5 < var8) {
            StackTraceElement var6 = var7[var5];
            var1.append("\n\tat ");
            var1.append(var6);
            ++var5;
         }
      }

   }

   public StackTraceElement[] R() {
      return this.O;
   }

   public static void n(l var0, final j var1, final net.y9.l var2, final int var3) {
      final int var4 = net.y9.l.h(var2);
      var0.L("Block type", new t() {
         public String v() throws Exception {
            return String.format("ID #%d (%s // %s)", new Object[]{Integer.valueOf(var4), var2.j(), var2.getClass().getCanonicalName()});
         }
      });
      var0.L("Block data value", new t() {
         public String t() throws Exception {
            if(var3 < 0) {
               return "Unknown? (Got " + var3 + ")";
            } else {
               String var1 = String.format("%4s", new Object[]{Integer.toBinaryString(var3)}).replace(" ", "0");
               return String.format("%1$d / 0x%1$X / 0b%2$s", new Object[]{Integer.valueOf(var3), var1});
            }
         }

         private static Exception a(Exception var0) {
            return var0;
         }
      });
      var0.L("Block location", new t() {
         public String x() throws Exception {
            return l.w(var1);
         }
      });
   }

   public static void X(l var0, final j var1, final n var2) {
      var0.L("Block", new t() {
         public String i() throws Exception {
            return var2.toString();
         }
      });
      var0.L("Block location", new t() {
         public String F() throws Exception {
            return l.w(var1);
         }
      });
   }

   public static void j(String var0) {
      G = var0;
   }

   public static String J() {
      return G;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      j("ttu5k");
   }

   static class f {
      private final String H;
      private final String U;

      public f(String var1, Object var2) {
         l.G;
         super();
         this.H = var1;
         if(var2 == null) {
            this.U = "~~NULL~~";
         }

         if(var2 instanceof Throwable) {
            Throwable var4 = (Throwable)var2;
            this.U = "~~ERROR~~ " + var4.getClass().getSimpleName() + ": " + var4.getMessage();
         }

         this.U = var2.toString();
      }

      public String m() {
         return this.H;
      }

      public String S() {
         return this.U;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
