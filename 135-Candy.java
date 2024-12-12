class Solution {
    public int candy(int[] r) {

        int ns[] = new int[r.length];
        int r1 = r[r.length - 1];

        for (int i = r.length - 2; i >= 0; i--) {

            if (r[i] > r1) {
                ns[i] = ns[i + 1] + 1;
                r1 = r[i];
            }

            else {
                ns[i] = 0;
                r1 = r[i];
            }
        }

        int c = ns[0] + 1;

        int l = c;

        for (int i = 1; i < r.length; i++) {

            if (r[i] > r[i - 1]) {
                int a = l + 1;
                c = c + a;
                l = a;
            }

            else {

                if (r[i] == r[i - 1]) {

                    int a = ns[i] + 1;

                    c = c + a;
                    l = a;

                }

                else {

                    if (l <=(ns[i] + 1)) {

                        c = c + (ns[i] + 2 - l);

                    }

                    int a = ns[i] + 1;
                    l = a;
                    c = c + a;
                }
            }
        }

        return c;

    }
}