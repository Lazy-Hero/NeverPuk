package net.nc;

import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;
import net.xn;
import net.u.d;

public abstract class m {
   private static d[] q;

   public boolean w(@Nullable m var1) {
      d[] var2 = I();
      return var1 == null?false:this == var1;
   }

   public abstract String D();

   public abstract String W(String var1);

   public abstract boolean e();

   public abstract boolean B();

   public abstract m.f q();

   public abstract net.cb.z b();

   public abstract Collection Q();

   public abstract m.f e();

   public abstract m.k U();

   public static void e(d[] var0) {
      q = var0;
   }

   public static d[] I() {
      return q;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(I() != null) {
         e(new d[4]);
      }

   }

   public static enum f {
      ALWAYS,
      NEVER,
      HIDE_FOR_OTHER_TEAMS,
      HIDE_FOR_OWN_TEAM;

      private static final Map F;
      public final String internalName;
      public final int id;

      public static String[] z() {
         return (String[])F.keySet().toArray(new String[F.size()]);
      }

      @Nullable
      public static m.f M(String var0) {
         return (m.f)F.get(var0);
      }

      private f(String var3, int var4) {
         this.internalName = var3;
         this.id = var4;
      }

      static {
         // $FF: Couldn't be decompiled
      }
   }

   public static enum k {
      ALWAYS,
      NEVER,
      HIDE_FOR_OTHER_TEAMS,
      HIDE_FOR_OWN_TEAM;

      private static final Map U;
      public final String name;
      public final int id;

      public static String[] P() {
         return (String[])U.keySet().toArray(new String[U.size()]);
      }

      @Nullable
      public static m.k y(String var0) {
         return (m.k)U.get(var0);
      }

      private k(String var3, int var4) {
         this.name = var3;
         this.id = var4;
      }

      static {
         // $FF: Couldn't be decompiled
      }
   }
}
