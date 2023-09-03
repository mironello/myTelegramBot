import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] s = new int[]{12, 4, 2, 4, 3};
        char[] k = new char[]{'d', 'f', 'u'};
        String[] a = new String[]{"ASd", "asd"};
        String[] b = new String[]{"vxcv", "xcs"};
        String[] c = new String[]{"Py 163", "ywze 997", "Be 574", "rezi 184", "Vizu 187", "wiqui 59", "epwy 181"};
        System.out.println(countBanknotes(2031));
        System.out.println(countBanknote(2031));
    }

    public static int countBanknote(int sum) {
        int[] banknotes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int count = 0;

        for (int i = 0; i < banknotes.length; i++) {
            while (sum >= banknotes[i]) {
                sum -= banknotes[i];
                count++;
            }
        }

        return count;
    }

    public static int countBanknotes(int sum) {
        int result = 0;
        while (sum != 0) {
            if (sum >= 500) {
                while (sum >= 500) {
                    sum -= 500;
                    result++;
                }
            } else if (sum >= 200) {
                while (sum >= 200) {
                    sum -= 200;
                    result++;
                }
            } else if (sum >= 100) {
                while (sum >= 100) {
                    sum -= 100;
                    result++;
                }
            } else if (sum >= 50) {
                while (sum >= 50) {
                    sum -= 50;
                    result++;
                }
            } else if (sum >= 20) {
                while (sum >= 20) {
                    sum -= 20;
                    result++;
                }
            } else if (sum >= 10) {
                while (sum >= 10) {
                    sum -= 10;
                    result++;
                }
            } else if (sum >= 5) {
                while (sum >= 5) {
                    sum -= 5;
                    result++;
                }
            } else if (sum >= 2) {
                while (sum >= 2) {
                    sum -= 2;
                    result++;
                }
            } else if (sum >= 1) {
                while (sum >= 1) {
                    sum -= 1;
                    result++;
                }
            }
        }

        return result;
    }

    public static int someQuads(int n) {
        int number = 1;
        int result = 0;
        while (number <= n) {
            result += number * number;
            number++;
        }
        return result;
    }

    public static String drawPattern(char[] pattern, int repeatCount) {
        String res = "";
        while (repeatCount > 0) {
            res += String.copyValueOf(pattern);
            repeatCount--;
        }
        return res;
    }

    public static String drawLine(int length) {
        String res = "";
//        while(length >0){
//            res+="*";
//            length--;
//            if(length>0){
//                res+="#";
//                length--;
//            }
//        }
        boolean star = true;
        while (length > 0) {
            res += star ? "*" : "#";
            star = !star;
            length--;
        }
        return res;
    }

    public static String drawRect(int width, int height, char c) {
        String result = "";

        int lines = height;

        while (lines > 0) {
            lines--;

            int columns = width;
            while (columns > 0) {
                result += c;
                columns--;
            }

            result += "\n";
        }

        return result;
    }


    public static String drawQuad(int n) {

        int k2 = 0;
        String res = "";
        while (k2 < n) {
            int k = 0;
            while (k < n) {
                res = res + "*";
                k++;
                if (k == n) {
                    res += '\n';
                }
            }
            k2++;
        }
        return res;
    }

    public static String getCheapStocks(String[] stocks) {
        String res = "";
        for (String el : stocks) {
            String[] temp = el.split(" ");
            if (Integer.parseInt(temp[1]) < 200) {
                res = String.join(" ", res, (temp[0]));
            }
        }
        return res;
    }

    public static Human geHuman() {
        String name = getName();
        int age = getAge();

        if (age >= 0 && age <= 150) {
            Human h = new Human();
            h.name = name;
            h.age = age;
            return h;
        }
        return null;
    }

    public static String getName() {
        Scanner s = new Scanner(System.in);
        System.out.println("Name");
        return s.nextLine();

    }

    public static int getAge() {
        Scanner s = new Scanner(System.in);
        System.out.println("Age");
        return s.nextInt();

    }

    public static String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {
        String[] res = new String[showcaseStocks.length + warehouseStocks.length];
        for (int i = 0; i < showcaseStocks.length - 1; i++) {
            res[i] = showcaseStocks[i];
        }
        for (int i = 0; i < warehouseStocks.length - 1; i++) {
            res[i + showcaseStocks.length] = warehouseStocks[i];
        }
        return res;
    }

    public static int[] removePrice(int[] prices, int toRemove) {
        int count = 0;
        for (int el : prices) {
            if (el == toRemove) {
                count++;
            }
        }
        int[] res = new int[prices.length - count];
        int count2 = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] != toRemove) {
                res[count2] = prices[i];
                count2++;
            }

        }
        return res;
    }
}
