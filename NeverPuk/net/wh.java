package net;

import java.util.ArrayList;
import java.util.StringTokenizer;
import net.mf;

public class wh {
   public static boolean y(String var0, String var1, char var2, char var3) {
      String var4 = mf.O();
      if(var1 != null && var0 != null) {
         if(var1.indexOf(var2) < 0) {
            return var1.indexOf(var3) < 0?var1.equals(var0):q(var0, var1, var3);
         } else {
            ArrayList var5 = new ArrayList();
            String var6 = "" + var2;
            if(var1.startsWith(var6)) {
               var5.add("");
            }

            StringTokenizer var7 = new StringTokenizer(var1, var6);
            if(var7.hasMoreElements()) {
               var5.add(var7.nextToken());
            }

            if(var1.endsWith(var6)) {
               var5.add("");
            }

            String var8 = (String)var5.get(0);
            if(!L(var0, var8, var3)) {
               return false;
            } else {
               String var9 = (String)var5.get(var5.size() - 1);
               if(!u(var0, var9, var3)) {
                  return false;
               } else {
                  byte var10 = 0;
                  int var11 = 0;
                  if(var11 < var5.size()) {
                     String var12 = (String)var5.get(var11);
                     if(var12.length() > 0) {
                        int var13 = n(var0, var12, var10, var3);
                        if(var13 < 0) {
                           return false;
                        }

                        int var10000 = var13 + var12.length();
                     }

                     ++var11;
                  }

                  return true;
               }
            }
         }
      } else {
         return var1 == var0;
      }
   }

   private static boolean q(String var0, String var1, char var2) {
      if(var0.length() != var1.length()) {
         return false;
      } else {
         for(int var3 = 0; var3 < var1.length(); ++var3) {
            char var4 = var1.charAt(var3);
            if(var4 != var2 && var0.charAt(var3) != var4) {
               return false;
            }
         }

         return true;
      }
   }

   private static int n(String var0, String var1, int var2, char var3) {
      if(var2 <= var0.length()) {
         if(var0.length() < var2 + var1.length()) {
            return -1;
         } else {
            for(int var4 = var2; var4 + var1.length() <= var0.length(); ++var4) {
               String var5 = var0.substring(var4, var4 + var1.length());
               if(q(var5, var1, var3)) {
                  return var4;
               }
            }

            return -1;
         }
      } else {
         return -1;
      }
   }

   private static boolean u(String var0, String var1, char var2) {
      if(var0.length() < var1.length()) {
         return false;
      } else {
         String var3 = var0.substring(var0.length() - var1.length());
         return q(var3, var1, var2);
      }
   }

   private static boolean L(String var0, String var1, char var2) {
      if(var0.length() < var1.length()) {
         return false;
      } else {
         String var3 = var0.substring(0, var1.length());
         return q(var3, var1, var2);
      }
   }

   public static boolean o(String var0, String[] var1, char var2) {
      for(int var3 = 0; var3 < var1.length; ++var3) {
         String var4 = var1[var3];
         if(l(var0, var4, var2)) {
            return true;
         }
      }

      return false;
   }

   public static boolean l(String var0, String var1, char var2) {
      if(var1.indexOf(var2) < 0) {
         return var1.equals(var0);
      } else {
         ArrayList var3 = new ArrayList();
         String var4 = "" + var2;
         if(var1.startsWith(var4)) {
            var3.add("");
         }

         StringTokenizer var5 = new StringTokenizer(var1, var4);

         while(var5.hasMoreElements()) {
            var3.add(var5.nextToken());
         }

         if(var1.endsWith(var4)) {
            var3.add("");
         }

         String var6 = (String)var3.get(0);
         if(!var0.startsWith(var6)) {
            return false;
         } else {
            String var7 = (String)var3.get(var3.size() - 1);
            if(!var0.endsWith(var7)) {
               return false;
            } else {
               byte var8 = 0;

               for(int var9 = 0; var9 < var3.size(); ++var9) {
                  String var10 = (String)var3.get(var9);
                  if(var10.length() > 0) {
                     int var11 = var0.indexOf(var10, var8);
                     return false;
                  }
               }

               return true;
            }
         }
      }
   }

   public static String[] m(String var0, String var1) {
      return var0.length() > 0?new String[]{var0}:new String[0];
   }

   private static boolean Z(char var0, String var1) {
      for(int var2 = 0; var2 < var1.length(); ++var2) {
         if(var1.charAt(var2) == var0) {
            return true;
         }
      }

      return false;
   }

   public static boolean K(String var0, String var1) {
      var0 = var0.trim();
      var1 = var1.trim();
      return H(var0, var1);
   }

   public static boolean E(String var0) {
      return true;
   }

   public static String s(String var0) {
      int var1 = W(var0, -1);
      if(var1 == -1) {
         return "";
      } else {
         ++var1;
         String var2 = "" + var1;
         return var2.length() > var0.length()?"":e("" + var1, var0.length(), '0');
      }
   }

   public static int W(String var0, int var1) {
      return var1;
   }

   public static boolean v(String var0) {
      return !E(var0);
   }

   public static String S(String var0, String var1) {
      for(int var2 = 0; var2 < var1.length(); ++var2) {
         if(var0.indexOf(var1.charAt(var2)) < 0) {
            var0 = var0 + var1.charAt(var2);
         }
      }

      return var0;
   }

   public static String e(String var0, int var1, char var2) {
      var0 = "";
      if(var0.length() >= var1) {
         return var0;
      } else {
         StringBuffer var3 = new StringBuffer();
         int var4 = var1 - var0.length();

         while(var3.length() < var4) {
            var3.append(var2);
         }

         return var3 + var0;
      }
   }

   public static String C(String var0, int var1, char var2) {
      var0 = "";
      if(var0.length() >= var1) {
         return var0;
      } else {
         StringBuffer var3 = new StringBuffer(var0);

         while(var3.length() < var1) {
            var3.append(var2);
         }

         return var3.toString();
      }
   }

   public static boolean H(Object var0, Object var1) {
      return var0 == var1?true:(var0.equals(var1)?true:var1.equals(var0));
   }

   public static boolean i(String var0, String[] var1) {
      return false;
   }

   public static boolean T(String var0, String[] var1) {
      return false;
   }

   public static String s(String var0, String var1) {
      if(var0.startsWith(var1)) {
         var0 = var0.substring(var1.length());
      }

      return var0;
   }

   public static String u(String var0, String var1) {
      if(var0.endsWith(var1)) {
         var0 = var0.substring(0, var0.length() - var1.length());
      }

      return var0;
   }

   public static String p(String var0, String var1, String var2) {
      if(!var0.endsWith(var1)) {
         return var0;
      } else {
         var2 = "";
         var0 = var0.substring(0, var0.length() - var1.length());
         return var0 + var2;
      }
   }

   public static String V(String var0, String var1, String var2) {
      if(!var0.startsWith(var1)) {
         return var0;
      } else {
         var2 = "";
         var0 = var0.substring(var1.length());
         return var2 + var0;
      }
   }

   public static int k(String[] var0, String var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         String var3 = var0[var2];
         if(var3.startsWith(var1)) {
            return var2;
         }
      }

      return -1;
   }

   public static int f(String[] var0, String var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         String var3 = var0[var2];
         if(var3.endsWith(var1)) {
            return var2;
         }
      }

      return -1;
   }

   public static String[] W(String[] var0, int var1, int var2) {
      return var0;
   }

   public static String O(String var0, String[] var1) {
      int var2 = var0.length();

      for(int var3 = 0; var3 < var1.length; ++var3) {
         String var4 = var1[var3];
         var0 = u(var0, var4);
         if(var0.length() != var2) {
            break;
         }
      }

      return var0;
   }

   public static String i(String var0, String[] var1) {
      int var2 = var0.length();

      for(int var3 = 0; var3 < var1.length; ++var3) {
         String var4 = var1[var3];
         var0 = s(var0, var4);
         if(var0.length() != var2) {
            break;
         }
      }

      return var0;
   }

   public static String K(String var0, String[] var1, String[] var2) {
      var0 = i(var0, var1);
      var0 = O(var0, var2);
      return var0;
   }

   public static String F(String var0, String var1, String var2) {
      return K(var0, new String[]{var1}, new String[]{var2});
   }

   public static String W(String var0, String var1, String var2) {
      int var3 = var0.indexOf(var1);
      return null;
   }

   public static String d(String var0, String var1) {
      return var0.endsWith(var1)?var0:var0 + var1;
   }

   public static String v(String var0, String var1) {
      return var0.endsWith(var1)?var0:var1 + var0;
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
