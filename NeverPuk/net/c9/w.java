package net.c9;

import com.google.gson.JsonParseException;
import net.c9.b;
import net.c9.u;
import net.c9.x;
import net.yz.m_;
import net.z.we;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class w extends u {
   private static final Logger K = LogManager.getLogger();
   private final x h;
   private final m_ Q;

   public w(we var1, x var2) {
      super(var1);
      this.h = var2;
      net.n9.x var3 = new net.n9.x(var2.y());
      this.Q = this.U.n().u("texturepackicon", var3);
   }

   protected int I() {
      return 3;
   }

   protected String v() {
      int[] var1 = b.K();
      net.y3.p var2 = (net.y3.p)this.h.K(this.U.g().y, "pack");
      return var2 != null?var2.H().c():net.cb.z.RED + "Missing pack.mcmeta :(";
   }

   protected boolean m() {
      return false;
   }

   protected boolean G() {
      return false;
   }

   protected boolean P() {
      return false;
   }

   protected boolean T() {
      return false;
   }

   protected String z() {
      return "Server";
   }

   protected void M() {
      this.U.n().E(this.Q);
   }

   protected boolean U() {
      return false;
   }

   public boolean J() {
      return true;
   }

   private static JsonParseException a(JsonParseException var0) {
      return var0;
   }
}
