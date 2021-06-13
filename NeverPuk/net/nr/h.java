package net.nr;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import net.c9.b;
import net.nr.d;
import net.yz.a4;
import org.lwjgl.input.Keyboard;

public class h implements Comparable {
   private static final Map f = Maps.newHashMap();
   private static final a4 Y = new a4();
   private static final Set C = Sets.newHashSet();
   private static final Map n = Maps.newHashMap();
   private final String T;
   private final int K;
   private final String s;
   private int S;
   public boolean V;
   private int u;

   public static void S(int var0) {
      h var1 = (h)Y.b(var0);
      ++var1.u;
   }

   public static void b(int var0, boolean var1) {
      h var2 = (h)Y.b(var0);
      var2.V = var1;
   }

   public static void J() {
      d.u();
      Iterator var1 = f.values().iterator();
      if(var1.hasNext()) {
         h var2 = (h)var1.next();
         b(var2.S, var2.S < 256 && Keyboard.isKeyDown(var2.S));
      }

   }

   public static void z() {
      for(h var1 : f.values()) {
         var1.Z();
      }

   }

   public static void G() {
      Y.d();

      for(h var1 : f.values()) {
         Y.t(var1.S, var1);
      }

   }

   public static Set U() {
      return C;
   }

   public h(String var1, int var2, String var3) {
      this.T = var1;
      this.S = var2;
      this.K = var2;
      this.s = var3;
      f.put(var1, this);
      Y.t(var2, this);
      C.add(var3);
   }

   public boolean o() {
      return this.V;
   }

   public String X() {
      return this.s;
   }

   public boolean r() {
      if(this.u == 0) {
         return false;
      } else {
         --this.u;
         return true;
      }
   }

   private void Z() {
      this.u = 0;
      this.V = false;
   }

   public String g() {
      return this.T;
   }

   public int a() {
      return this.K;
   }

   public int m() {
      return this.S;
   }

   public void s(int var1) {
      this.S = var1;
   }

   public int Z(h var1) {
      String var2 = d.u();
      int var10000 = this.s.equals(var1.s)?b.x(this.T, new Object[0]).compareTo(b.x(var1.T, new Object[0])):((Integer)n.get(this.s)).compareTo((Integer)n.get(var1.s));
      if(net.u.d.y() == null) {
         d.O("I9t9wc");
      }

      return var10000;
   }

   public static Supplier I(String var0) {
      h var1 = (h)f.get(var0);
      return () -> {
         return var0;
      };
   }

   // $FF: synthetic method
   private static String lambda$func_193626_b$1(h var0) {
      return d.y(var0.m());
   }

   static {
      n.put("key.categories.movement", Integer.valueOf(1));
      n.put("key.categories.gameplay", Integer.valueOf(2));
      n.put("key.categories.inventory", Integer.valueOf(3));
      n.put("key.categories.creative", Integer.valueOf(4));
      n.put("key.categories.multiplayer", Integer.valueOf(5));
      n.put("key.categories.ui", Integer.valueOf(6));
      n.put("key.categories.misc", Integer.valueOf(7));
   }

   private static IndexOutOfBoundsException a(IndexOutOfBoundsException var0) {
      return var0;
   }
}
