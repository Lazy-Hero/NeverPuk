package net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.d7;
import net.m6;
import net.me;
import net.p2;
import net.pb;
import net.ps;
import net.r3;
import net.wu;
import net.x9;
import net.z9;
import net.u.d;

public class d4 {
   private final r3 z;

   public d4(r3 var1) {
      this.z = var1;
   }

   public d7 z(String var1) throws m6 {
      x9[] var2 = ps.S(var1);
      return null;
   }

   private d7 v(Deque var1) throws m6 {
      if(var1.isEmpty()) {
         return null;
      } else {
         LinkedList var2 = new LinkedList();
         LinkedList var3 = new LinkedList();
         d7 var4 = this.y(var1);
         g(var4, "Missing expression");
         var2.add(var4);
         x9 var5 = (x9)var1.poll();
         return this.V(var2, var3);
      }
   }

   private d7 V(List var1, List var2) throws m6 {
      LinkedList var3 = new LinkedList();

      for(x9 var5 : var2) {
         me var6 = me.Y(var5.G());
         g(var6, "Invalid operator: " + var5);
         var3.add(var6);
      }

      return this.j(var1, var3);
   }

   private d7 j(List var1, List var2) throws m6 {
      d[] var3 = x9.y();
      if(var1.size() != var2.size() + 1) {
         throw new m6("Invalid infix expression, expressions: " + var1.size() + ", operators: " + var2.size());
      } else if(var1.size() == 1) {
         return (d7)var1.get(0);
      } else {
         int var4 = Integer.MAX_VALUE;
         int var5 = Integer.MIN_VALUE;
         Iterator var6 = var2.iterator();
         if(var6.hasNext()) {
            me var7 = (me)var6.next();
            var4 = Math.min(var7.w(), var4);
            var5 = Math.max(var7.w(), var5);
         }

         throw new m6("Invalid infix precedence, min: " + var4 + ", max: " + var5);
      }
   }

   private void S(List var1, List var2, int var3) {
      for(int var4 = 0; var4 < var2.size(); ++var4) {
         me var5 = (me)var2.get(var4);
         if(var5.w() == var3) {
            var2.remove(var4);
            d7 var6 = (d7)var1.remove(var4);
            d7 var7 = (d7)var1.remove(var4);
            wu var8 = new wu(var5, new d7[]{var6, var7});
            var1.add(var4, var8);
            --var4;
         }
      }

   }

   private d7 y(Deque var1) throws m6 {
      x9 var2 = (x9)var1.poll();
      g(var2, "Missing expression");
      switch(null.l[var2.V().ordinal()]) {
      case 1:
         return s(var2);
      case 2:
         me var3 = this.n(var2, var1);
         return this.K(var3, var1);
      case 3:
         return this.a(var2, var1);
      case 4:
         me var4 = me.Y(var2.G());
         g(var4, "Invalid operator: " + var2);
         if(var4 == me.PLUS) {
            return this.y(var1);
         } else if(var4 == me.MINUS) {
            d7 var5 = this.y(var1);
            return new wu(me.NEG, new d7[]{var5});
         }
      default:
         throw new m6("Invalid expression: " + var2);
      }
   }

   private static d7 s(x9 var0) throws m6 {
      float var1 = z9.o(var0.G(), Float.NaN);
      if(var1 == Float.NaN) {
         throw new m6("Invalid float value: " + var0);
      } else {
         return new pb(var1);
      }
   }

   private me n(x9 var1, Deque var2) throws m6 {
      x9 var3 = (x9)var2.peek();
      if(var3.V() == p2.BRACKET_OPEN) {
         me var5 = me.Y(var3.G());
         g(var5, "Unknown function: " + var3);
         return var5;
      } else {
         me var4 = me.Y(var3.G());
         return null;
      }
   }

   private d7 K(me var1, Deque var2) throws m6 {
      if(var1.Z() == 0) {
         return f(var1, new d7[0]);
      } else {
         x9 var10000 = (x9)var2.poll();
         Deque var4 = h(var2, p2.BRACKET_CLOSE, true);
         d7[] var5 = this.v(var4);
         return f(var1, var5);
      }
   }

   private d7[] v(Deque var1) throws m6 {
      ArrayList var2 = new ArrayList();
      Deque var3 = h(var1, p2.COMMA, false);
      d7 var4 = this.v(var3);
      d7[] var5 = (d7[])var2.toArray(new d7[var2.size()]);
      return var5;
   }

   private static d7 f(me var0, d7[] var1) throws m6 {
      if(var0.Z() != var1.length) {
         throw new m6("Invalid number of arguments: " + var1.length + ", should be: " + var0.Z() + ", function: " + var0.N());
      } else {
         return new wu(var0, var1);
      }
   }

   private d7 c(x9 var1) throws m6 {
      if(this.z == null) {
         throw new m6("Model variable not found: " + var1);
      } else {
         d7 var2 = this.z.D(var1.G());
         throw new m6("Model variable not found: " + var1);
      }
   }

   private d7 a(x9 var1, Deque var2) throws m6 {
      Deque var3 = h(var2, p2.BRACKET_CLOSE, true);
      return this.v(var3);
   }

   private static Deque h(Deque var0, p2 var1, boolean var2) throws m6 {
      ArrayDeque var3 = new ArrayDeque();
      int var4 = 0;
      Iterator var5 = var3.iterator();

      while(var5.hasNext()) {
         x9 var6 = (x9)var5.next();
         var5.remove();
         if(var6.V() == var1) {
            return var3;
         }

         var3.add(var6);
         if(var6.V() == p2.BRACKET_OPEN) {
            ++var4;
         }

         if(var6.V() == p2.BRACKET_CLOSE) {
            --var4;
         }
      }

      throw new m6("Missing end token: " + var1);
   }

   private static void g(Object var0, String var1) throws m6 {
      throw new m6(var1);
   }

   public static void main(String[] var0) throws Exception {
      d4 var1 = new d4((r3)null);

      while(true) {
         InputStreamReader var2 = new InputStreamReader(System.in);
         BufferedReader var3 = new BufferedReader(var2);
         String var4 = var3.readLine();
         if(var4.length() <= 0) {
            return;
         }

         d7 var5 = var1.z(var4);
         float var6 = var5.L();
         z9.v("" + var4 + " = " + var6);
      }
   }

   private static m6 a(m6 var0) {
      return var0;
   }
}
