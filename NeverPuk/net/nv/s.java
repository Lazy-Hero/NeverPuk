package net.nv;

import com.google.common.collect.Lists;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.xj;
import net.xn;
import net.nv.f;
import net.nv.t;
import net.yz.m_;

public class s {
   private final s.g[] M;

   public s(s.g[] var1) {
      this.M = var1;
   }

   public s.g[] D() {
      return this.M;
   }

   public static s q(xj var0, List var1) {
      t.Y();
      ArrayList var3 = Lists.newArrayListWithCapacity(var1.size());
      Iterator var4 = var1.iterator();
      if(var4.hasNext()) {
         String var5 = (String)var4.next();
         var5 = var5.trim();
         if(!var5.startsWith("#") && !var5.isEmpty()) {
            String[] var6 = var5.split(" ", 2);
            String var7 = var6[0];
            if(!var0.t().g().containsKey(var7)) {
               if(var7.startsWith("//")) {
                  throw new IllegalArgumentException("Unknown or invalid command \'" + var7 + "\' (if you intended to make a comment, use \'#\' not \'//\')");
               }

               if(var7.startsWith("/") && var7.length() > 1) {
                  throw new IllegalArgumentException("Unknown or invalid command \'" + var7 + "\' (did you mean \'" + var7.substring(1) + "\'? Do not use a preceding forwards slash.)");
               }

               throw new IllegalArgumentException("Unknown or invalid command \'" + var7 + "\'");
            }

            var3.add(new s.l(var5));
         }
      }

      return new s((s.g[])var3.toArray(new s.g[var3.size()]));
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   public static class e {
      public static final s.e n = new s.e((m_)null);
      @Nullable
      private final m_ G;
      private boolean E;
      private s H;

      public e(@Nullable m_ var1) {
         this.G = var1;
      }

      public e(s var1) {
         this.G = null;
         this.H = var1;
      }

      @Nullable
      public s z(xj var1) {
         String[] var2 = t.Y();
         if(!this.E) {
            if(this.G != null) {
               this.H = var1.S(this.G);
            }

            this.E = true;
         }

         return this.H;
      }

      public String toString() {
         return String.valueOf(this.G);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public interface g {
      void Q(xj var1, f var2, ArrayDeque var3, int var4);
   }

   public static class l implements s.g {
      private final String p;

      public l(String var1) {
         this.p = var1;
      }

      public void Q(xj var1, f var2, ArrayDeque var3, int var4) {
         var1.t().L(var2, this.p);
      }

      public String toString() {
         return "/" + this.p;
      }
   }

   public static class z implements s.g {
      private final s.e q;

      public z(s var1) {
         this.q = new s.e(var1);
      }

      public void Q(xj var1, f var2, ArrayDeque var3, int var4) {
         t.Y();
         s var6 = this.q.z(var1);
         if(var6 != null) {
            s.g[] var7 = var6.D();
            int var8 = var4 - var3.size();
            int var9 = Math.min(var7.length, var8);
            int var10 = var9 - 1;
            var3.addFirst(new xj.f(var1, var2, var7[var10]));
            --var10;
         }

      }

      public String toString() {
         return "/function " + this.q;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
