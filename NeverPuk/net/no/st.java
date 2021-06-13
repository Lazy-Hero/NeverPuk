package net.no;

import java.io.IOException;
import net.no.s8;

public class st implements net.n2.k {
   private String u = "";
   private String l = "";
   private int S;
   private st.r Y;

   public st() {
   }

   public st(net.nc.o var1) {
      this.u = var1.W();
      this.l = var1.M().e();
      this.S = var1.W();
      this.Y = st.r.CHANGE;
   }

   public st(String var1) {
      this.u = var1;
      this.l = "";
      this.S = 0;
      this.Y = st.r.REMOVE;
   }

   public st(String var1, net.nc.l var2) {
      this.u = var1;
      this.l = var2.e();
      this.S = 0;
      this.Y = st.r.REMOVE;
   }

   public void E(net.n2.h var1) throws IOException {
      this.u = var1.Z(40);
      s8.Y();
      this.Y = (st.r)var1.S(st.r.class);
      this.l = var1.Z(16);
      if(this.Y != st.r.REMOVE) {
         this.S = var1.q();
      }

   }

   public void O(net.n2.h var1) throws IOException {
      var1.R(this.u);
      s8.Y();
      var1.A(this.Y);
      var1.R(this.l);
      if(this.Y != st.r.REMOVE) {
         var1.a(this.S);
      }

   }

   public void k(net.x.t var1) {
      var1.N(this);
   }

   public String g() {
      return this.u;
   }

   public String K() {
      return this.l;
   }

   public int H() {
      return this.S;
   }

   public st.r G() {
      return this.Y;
   }

   private static IOException a(IOException var0) {
      return var0;
   }

   public static enum r {
      CHANGE,
      REMOVE;
   }
}
