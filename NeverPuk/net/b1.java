package net;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import net.i0;
import net.i5;
import net.i_;
import net.ia;
import net.id;
import net.ie;
import net.il;
import net.io;
import net.ip;
import net.ix;
import net.iy;
import net.iz;
import net.q0;
import net.q1;
import net.q2;
import net.q3;
import net.q4;
import net.q5;
import net.q6;
import net.q7;
import net.q8;
import net.q9;
import net.q_;
import net.qa;
import net.qb;
import net.qc;
import net.qe;
import net.qf;
import net.qg;
import net.qh;
import net.qi;
import net.qj;
import net.qk;
import net.ql;
import net.qm;
import net.qn;
import net.qo;
import net.qp;
import net.qq;
import net.qr;
import net.qs;
import net.qt;
import net.qu;
import net.qv;
import net.qw;
import net.qx;
import net.qz;
import net.r1;
import net.r2;
import net.r4;
import net.r7;
import net.r8;
import net.rb;
import net.rc;
import net.rf;
import net.rg;
import net.rh;
import net.ri;
import net.rj;
import net.rm;
import net.rn;
import net.rq;
import net.rr;
import net.rs;
import net.rt;
import net.ru;
import net.rv;
import net.rw;
import net.xn;
import net.z9;

public class b1 {
   private static final Map f = q();

   private static Map q() {
      LinkedHashMap var0 = new LinkedHashMap();
      M(var0, new ia());
      M(var0, new i0());
      M(var0, new qi());
      M(var0, new q1());
      M(var0, new rj());
      M(var0, new qq());
      M(var0, new q5());
      M(var0, new qu());
      M(var0, new qg());
      M(var0, new qt());
      M(var0, new qf());
      M(var0, new qb());
      M(var0, new io());
      M(var0, new qw());
      M(var0, new qa());
      M(var0, new qm());
      M(var0, new qj());
      M(var0, new qn());
      M(var0, new qc());
      M(var0, new il());
      M(var0, new q0());
      M(var0, new qk());
      M(var0, new qx());
      M(var0, new qo());
      M(var0, new ql());
      M(var0, new qz());
      M(var0, new qp());
      M(var0, new rv());
      M(var0, new q9());
      M(var0, new q_());
      M(var0, new ri());
      M(var0, new ip());
      M(var0, new r1());
      M(var0, new r7());
      M(var0, new r4());
      M(var0, new rq());
      M(var0, new rg());
      M(var0, new rf());
      M(var0, new iz());
      M(var0, new q6());
      M(var0, new rb());
      M(var0, new rw());
      M(var0, new rm());
      M(var0, new rn());
      M(var0, new i_());
      M(var0, new id());
      M(var0, new rh());
      M(var0, new qe());
      M(var0, new rs());
      M(var0, new r8());
      M(var0, new i5());
      M(var0, new rc());
      M(var0, new rt());
      M(var0, new ix());
      M(var0, new q3());
      M(var0, new qv());
      M(var0, new r2());
      M(var0, new ie());
      M(var0, new q4());
      M(var0, new q2());
      M(var0, new q7());
      M(var0, new qr());
      M(var0, new qh());
      M(var0, new qs());
      M(var0, new q8());
      M(var0, new ru());
      M(var0, new rr());
      return var0;
   }

   private static void M(Map var0, iy var1) {
      if(var0.containsKey(var1.f())) {
         z9.h("Model adapter already registered for id: " + var1.f() + ", class: " + var1.b().getName());
      }

      var0.put(var1.f(), var1);
   }

   public static iy Q(String var0) {
      return (iy)f.get(var0);
   }

   public static String[] l() {
      Set var0 = f.keySet();
      String[] var1 = (String[])var0.toArray(new String[var0.size()]);
      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
