package LeetCode;


import java.util.Arrays;


    class Solution {
        public int carFleet(int target, int[] position, int[] speed) {
            // n = maşınların sayı
            int n = position.length;


            double[][] cars = new double[n][2];

            // Hər maşın üçün mövqe və vaxtı hesablayırıq
            for (int i = 0; i < n; i++) {
                cars[i][0] = position[i];  // maşının mövqeyi
                // maşının target-ə çatma vaxtı: (qalan məsafə / sürət)
                // (double) → int bölməsini real ədədə çevirir ki, dəqiq nəticə alınsın
                cars[i][1] = (double)(target - position[i]) / speed[i];
            }

            Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

            // fleets → fleet sayını saxlayır
            int fleets = 0;
            // maxTime → indiyə qədərki ən gec çatacaq fleet-in vaxtı
            double maxTime = 0;

            // Öndən arxaya bütün maşınlara baxırıq
            for (int i = 0; i < n; i++) {
                double time = cars[i][1];


                if (time > maxTime) {
                    fleets++;       // yeni fleet sayılır
                    maxTime = time; // maxTime yenilənir
                }

            }
            return fleets;
        }
    }


