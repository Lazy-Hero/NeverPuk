package net;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import net.d8;
import net.dh;
import net.ds;
import net.gn;
import net.u.d;

public class g6 {
   private static final File y = new File(gn.K);
   public static ArrayList h = new ArrayList();

   public g6() {
      g6.z.X;
      h.add(new dh("alts", true));
      h.add(new d8("macro", true));
      h.add(new ds("friends", true));
      d.h(new d[5]);
   }

   public void h() {
      g6.z.X;
      Iterator var2 = h.iterator();
      if(var2.hasNext()) {
         g6.z var3 = (g6.z)var2.next();
         if(var3.e()) {
            var3.n();
         }
      }

   }

   public void Q() {
      g6.z.X;
      Iterator var2 = h.iterator();
      if(var2.hasNext()) {
         g6.z var3 = (g6.z)var2.next();
         var3.Q();
      }

      if(d.y() == null) {
         g6.z.X = new int[4];
      }

   }

   public g6.z q(Class var1) {
      for(g6.z var3 : h) {
         if(var3.getClass() == var1) {
            return var3;
         }
      }

      return null;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   public abstract static class z {
      private final File E;
      private final String s;
      private final boolean B;
      private static int[] X;

      public z(String var1, boolean var2) {
         W();
         super();
         this.s = var1;
         this.B = var2;
         this.E = new File(g6.y, var1 + ".txt");
         if(!this.E.exists()) {
            this.Q();
         }

      }

      public final File w() {
         return this.E;
      }

      private boolean e() {
         return this.B;
      }

      public final String R() {
         return this.s;
      }

      public abstract void n() throws IOException;

      public abstract void Q() throws IOException;

      public static void W(int[] var0) {
         X = var0;
      }

      public static int[] W() {
         return X;
      }

      private static Exception a(Exception var0) {
         return var0;
      }

      static {
         if(W() != null) {
            W(new int[2]);
         }

      }
   }
}
