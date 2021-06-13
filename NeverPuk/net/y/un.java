package net.y;

import net.yz.aq;

public enum un {
   DOWN(new un.k[]{new un.k(un.u.P, un.u.f, un.u.Q), new un.k(un.u.P, un.u.f, un.u.m), new un.k(un.u.s, un.u.f, un.u.m), new un.k(un.u.s, un.u.f, un.u.Q)}),
   UP(new un.k[]{new un.k(un.u.P, un.u.L, un.u.m), new un.k(un.u.P, un.u.L, un.u.Q), new un.k(un.u.s, un.u.L, un.u.Q), new un.k(un.u.s, un.u.L, un.u.m)}),
   NORTH(new un.k[]{new un.k(un.u.s, un.u.L, un.u.m), new un.k(un.u.s, un.u.f, un.u.m), new un.k(un.u.P, un.u.f, un.u.m), new un.k(un.u.P, un.u.L, un.u.m)}),
   SOUTH(new un.k[]{new un.k(un.u.P, un.u.L, un.u.Q), new un.k(un.u.P, un.u.f, un.u.Q), new un.k(un.u.s, un.u.f, un.u.Q), new un.k(un.u.s, un.u.L, un.u.Q)}),
   WEST(new un.k[]{new un.k(un.u.P, un.u.L, un.u.m), new un.k(un.u.P, un.u.f, un.u.m), new un.k(un.u.P, un.u.f, un.u.Q), new un.k(un.u.P, un.u.L, un.u.Q)}),
   EAST(new un.k[]{new un.k(un.u.s, un.u.L, un.u.Q), new un.k(un.u.s, un.u.f, un.u.Q), new un.k(un.u.s, un.u.f, un.u.m), new un.k(un.u.s, un.u.L, un.u.m)});

   private static final un[] K = new un[6];
   private final un.k[] N;

   public static un n(aq var0) {
      return K[var0.w()];
   }

   private un(un.k[] var3) {
      this.N = var3;
   }

   public un.k k(int var1) {
      return this.N[var1];
   }

   static {
      K[un.u.f] = DOWN;
      K[un.u.L] = UP;
      K[un.u.m] = NORTH;
      K[un.u.Q] = SOUTH;
      K[un.u.P] = WEST;
      K[un.u.s] = EAST;
   }

   public static class k {
      public final int V;
      public final int j;
      public final int C;

      private k(int var1, int var2, int var3) {
         this.V = var1;
         this.j = var2;
         this.C = var3;
      }
   }

   public static final class u {
      public static final int Q = aq.SOUTH.w();
      public static final int L = aq.UP.w();
      public static final int s = aq.EAST.w();
      public static final int m = aq.NORTH.w();
      public static final int f = aq.DOWN.w();
      public static final int P = aq.WEST.w();
   }
}
