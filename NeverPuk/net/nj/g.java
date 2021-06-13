package net.nj;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import net.nj.a;
import net.nj.d;
import net.nj.f;
import net.nj.h;
import net.nj.j;
import net.nj.k;
import net.nj.l;
import net.nj.n;
import net.nj.q;
import net.nj.r;
import net.nj.t;
import net.nj.u;
import net.nj.v;
import net.nj.y;

public class g {
   private static final Pattern D = Pattern.compile("[-+]?(?:[0-9]+[.]|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?", 2);
   private static final Pattern N = Pattern.compile("[-+]?(?:[0-9]+[.]?|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?d", 2);
   private static final Pattern O = Pattern.compile("[-+]?(?:[0-9]+[.]?|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?f", 2);
   private static final Pattern p = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)b", 2);
   private static final Pattern a = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)l", 2);
   private static final Pattern k = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)s", 2);
   private static final Pattern V = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)");
   private final String I;
   private int H;

   public static f c(String var0) throws l {
      return (new g(var0)).v();
   }

   @VisibleForTesting
   f v() throws l {
      f var1 = this.E();
      this.o();
      if(this.T()) {
         ++this.H;
         throw this.C("Trailing data found");
      } else {
         return var1;
      }
   }

   @VisibleForTesting
   g(String var1) {
      this.I = var1;
   }

   protected String a() throws l {
      this.o();
      if(!this.T()) {
         throw this.C("Expected key");
      } else {
         return this.r() == 34?this.I():this.P();
      }
   }

   private l C(String var1) {
      return new l(var1, this.I, this.H);
   }

   protected q L() throws l {
      this.o();
      if(this.r() == 34) {
         return new y(this.I());
      } else {
         String var1 = this.P();
         if(var1.isEmpty()) {
            throw this.C("Expected value");
         } else {
            return this.Y(var1);
         }
      }
   }

   private q Y(String var1) {
      int var2 = q.H();
      return (q)(O.matcher(var1).matches()?new j(Float.parseFloat(var1.substring(0, var1.length() - 1))):(p.matcher(var1).matches()?new a(Byte.parseByte(var1.substring(0, var1.length() - 1))):(a.matcher(var1).matches()?new k(Long.parseLong(var1.substring(0, var1.length() - 1))):(k.matcher(var1).matches()?new r(Short.parseShort(var1.substring(0, var1.length() - 1))):(V.matcher(var1).matches()?new u(Integer.parseInt(var1)):(N.matcher(var1).matches()?new v(Double.parseDouble(var1.substring(0, var1.length() - 1))):(D.matcher(var1).matches()?new v(Double.parseDouble(var1)):("true".equalsIgnoreCase(var1)?new a((byte)1):("false".equalsIgnoreCase(var1)?new a((byte)0):new y(var1))))))))));
   }

   private String I() throws l {
      ++this.H;
      Object var2 = null;
      boolean var3 = false;

      while(this.T()) {
         char var4 = this.l();
         if(var4 != 92 && var4 != 34) {
            throw this.C("Invalid escape of \'" + var4 + "\'");
         }

         var3 = false;
         ((StringBuilder)var2).append(var4);
      }

      throw this.C("Missing termination quote");
   }

   private String P() {
      int var1;
      for(var1 = this.H; this.T() && this.b(this.r()); ++this.H) {
         ;
      }

      return this.I.substring(var1, this.H);
   }

   protected q C() throws l {
      this.o();
      if(!this.T()) {
         throw this.C("Expected value");
      } else {
         char var1 = this.r();
         return (q)(var1 == 123?this.E():(var1 == 91?this.J():this.L()));
      }
   }

   protected q J() throws l {
      return this.y(2) && this.b((int)1) != 34 && this.b((int)2) == 59?this.X():this.W();
   }

   protected f E() throws l {
      this.P('{');
      f var1 = new f();
      this.o();

      while(this.T() && this.r() != 125) {
         String var2 = this.a();
         if(var2.isEmpty()) {
            throw this.C("Expected non-empty key");
         }

         this.P(':');
         var1.K(var2, this.C());
         if(!this.Y()) {
            break;
         }

         if(!this.T()) {
            throw this.C("Expected key");
         }
      }

      this.P('}');
      return var1;
   }

   private q W() throws l {
      this.P('[');
      this.o();
      if(!this.T()) {
         throw this.C("Expected value");
      } else {
         h var1 = new h();
         boolean var2 = true;

         while(this.r() != 93) {
            q var3 = this.C();
            byte var4 = var3.C();
            var1.m(var3);
            if(!this.Y()) {
               break;
            }

            if(!this.T()) {
               throw this.C("Expected value");
            }
         }

         this.P(']');
         return var1;
      }
   }

   private q X() throws l {
      this.P('[');
      char var1 = this.l();
      this.l();
      this.o();
      if(!this.T()) {
         throw this.C("Expected value");
      } else if(var1 == 66) {
         return new t(this.Q((byte)7, (byte)1));
      } else if(var1 == 76) {
         return new d(this.Q((byte)12, (byte)4));
      } else if(var1 == 73) {
         return new n(this.Q((byte)11, (byte)3));
      } else {
         throw this.C("Invalid array type \'" + var1 + "\' found");
      }
   }

   private List Q(byte var1, byte var2) throws l {
      ArrayList var3 = Lists.newArrayList();

      while(true) {
         if(this.r() != 93) {
            q var4 = this.C();
            byte var5 = var4.C();
            if(var5 != var2) {
               throw this.C("Unable to insert " + q.d(var5) + " into " + q.d(var1));
            }

            if(var2 == 1) {
               var3.add(Byte.valueOf(((net.nj.z)var4).k()));
            } else if(var2 == 4) {
               var3.add(Long.valueOf(((net.nj.z)var4).q()));
            } else {
               var3.add(Integer.valueOf(((net.nj.z)var4).Q()));
            }

            if(this.Y()) {
               if(!this.T()) {
                  throw this.C("Expected value");
               }
               continue;
            }
         }

         this.P(']');
         return var3;
      }
   }

   private void o() {
      while(this.T() && Character.isWhitespace(this.r())) {
         ++this.H;
      }

   }

   private boolean Y() {
      this.o();
      if(this.T() && this.r() == 44) {
         ++this.H;
         this.o();
         return true;
      } else {
         return false;
      }
   }

   private void P(char var1) throws l {
      this.o();
      boolean var2 = this.T();
      if(this.r() == var1) {
         ++this.H;
      } else {
         throw new l("Expected \'" + var1 + "\' but got \'" + Character.valueOf(this.r()) + "\'", this.I, this.H + 1);
      }
   }

   protected boolean b(char var1) {
      return var1 >= 48 && var1 <= 57 || var1 >= 65 && var1 <= 90 || var1 >= 97 && var1 <= 122 || var1 == 95 || var1 == 45 || var1 == 46 || var1 == 43;
   }

   private boolean y(int var1) {
      return this.H + var1 < this.I.length();
   }

   boolean T() {
      return this.y(0);
   }

   private char b(int var1) {
      return this.I.charAt(this.H + var1);
   }

   private char r() {
      return this.b((int)0);
   }

   private char l() {
      return this.I.charAt(this.H++);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
