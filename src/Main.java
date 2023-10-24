import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userCommand;
        int localMenuButton = -1;

        String[] allAlbums = {"This Is What the Edge of Your Seat Was Made For 2006", "Count Your Blessings 2006", "Suicide Season 2008", "There Is a Hell, Believe Me I’ve Seen It 2010", "Sempiternal 2013", "That’s the Spirit 2015", "Amo 2019", "Music to listen to~dance to~blaze 2019", "Post Human: Survival Horror 2020"};

        String[] postHumanSurvivalHorror2020 = {"One Day The Only Butterflies Left Will Be In Your Chest As You March Towards Your Death ", "Kingslayer ", "1x1 ", "Obey ", "Parasite Eve ", "Teardrops ", "Dear Diary ", "Ludens ", "Itch For The Cure (When Will We Be Free?) "};
        int[] postHumanCount = {29479128, 150643913, 87480775, 97212391, 159930729, 134602104, 41936902, 93906339, 17840795};

        String[] musicTolistenToDanceToBlaze2019 = {"±ªþ³§ ", "¿ ", "like seeing spiders running riot on your lover's grave ", "Underground Big {HEADFULOFHYENA} ", "Dead Dolphin Sounds 'aid brain growth in unborn child' Virtual Therapy / Nature Healing 2 Hours ", "Steal Something. ", "A Devastating Liberation ", "Candy Truck / You Expected: LAB Your Result: Green "};
        int[] musicToCount = {4616476, 17641986, 2773519, 2859937, 2159584, 4400992, 2335283, 2799162};

        String[] amo2019 = {"Nihilist Blues ", "heavy metal ", "wonderful life ", "why you gotta kick me when i'm down? ", "mother tongue ", "i apologise if you feel something ", "fresh bruises ", "i don't know what to say ", "MANTRA ", "sugar honey ice & tea ", "in the dark ", "ouch ", "medicine "};
        int[] amoCount = {42287979, 34925007, 65108649, 33939987, 61512625, 20412103, 13185436, 23181225, 151295003, 66525095, 63500613, 20249134, 93639673};

        String[] thatsTheSpirit2015 = {"Avalanche ", "What You Need ", "Follow You ", "Blasphemy ", "Happy Song ", "Oh No ", "True Friends ", "Run ", "Doomed ", "Drown ", "Throne "};
        int[] thatsTheCount = {129059319, 53623189, 210312384, 76377546, 191286160, 69288121, 157020027, 61611341, 111243547, 207091066, 372721363};

        String[] sempiternal2013 = {"And The Snakes Start To Sing ", "Shadow Moses ", "The House of Wolves [Explicit] ", "Antivist ", "Empire (Let Them Sing) ", "Hospital For Souls ", "Sleepwalking ", "Go To Hell, For Heaven's Sake ", "Seen It All Before ", "Can You Feel My Heart ", "Crooked Young ", "Join the club ", "Deathbeds "};
        int[] sempiternalCount = {49590216, 155450449, 78692280, 44036865, 58736664, 49035413, 196059894, 84878736, 31131592, 563844709, 29686888, 23611665, 40753534};

        String[] ThereIsAHellBelieveMe = {"Crucify Me ", "Anthem ", "It Never Ends ", "Fuck ", "Don't Go ", "Home Sweet Hole ", "Alligator Blood ", "Visions ", "Blacklist ", "Memorial ", "Blessed With A Curse ", "The Fox And The Wolf "};
        int[] thereIsAHellCount = {32342381, 13749453, 49533501, 17662122, 32362535, 9826653, 20953379, 11126276, 9093199, 8117601, 29557276, 7392319};

        String[] suicideSeason2008 = {"Football Season is Over ", "The Sadness Will Never End ", "Death Breath ", "Sleep With One Eye Open ", "No Need For Introductions, I've Read About Girls Like You On The Backs Of Toilet Doors ", "Suicide Season ", "Diamonds Aren't Forever [Explicit] ", "The Comedown ", "It Was Written In Blood ", "Chelsea Smile [Explicit] "};
        int[] suicideCount = {7299303, 21030185, 8667308, 9019289, 6299131, 16539848, 29045027, 18185721, 10702478, 56429841};

        String[] countYourBlessings2006 = {"(I Used to Make Out With) Medusa ", "Fifteen Fathoms, Counting ", "Black & Blue ", "Slow Dance ", "For Stevie Wonder's Eyes Only ", "Tell Slater Not to Wash His Dick ", "Pray for Plagues ", "Off the Heezay ", "A Lot Like Vegas ", "Liquor & Love Lost "};
        int[] countCount = {7060384, 5086132, 5790755, 3679321, 7299794, 6779769, 20802101, 4240341, 4935282, 3949938};

        String[] thisIsWhattheEdgeofYourSeatWasMadeFor2006 = {"Rawwwrr! ", "Traitors Never Play Hang-Man ", "Who Wants Flowers When You're Dead? Nobody ", "RE: They Have No Reflections "};
        int[] thisIsCount = {1808400, 3029258, 1386810, 1780995};

        while(true) {

                System.out.println("Выберите альбом который хотите посмотреть: ");
                for (int k = 0; k < allAlbums.length; k++) {
                    System.out.println(((k + 1)) + " " + allAlbums[k]);
                }
            System.out.println("Для выхода нажмите - 0 ");
            System.out.println("Введите от 1 до 9 в консоль: ");
                 userCommand = scanner.nextInt();
                 if(userCommand == 0){
                     break;
                 }
                 else if(userCommand >=1 && userCommand<=9){
                     localMenuButton = - 1;
                 }
            while (localMenuButton != 0) {
                if (userCommand == 1) {
                    for (int a = 0; a < thisIsWhattheEdgeofYourSeatWasMadeFor2006.length; a++) {
                        if (a == 0) {
                            System.out.println("Список треков альбома: ");
                        }
                        System.out.println(((a + 1)) + " " + thisIsWhattheEdgeofYourSeatWasMadeFor2006[a] + " - прослушиваний на треке " + thisIsCount[a] + ".");
                    }
                } else if (userCommand == 2) {
                    for (int a = 0; a < countYourBlessings2006.length; a++) {
                        if (a == 0) {
                            System.out.println("Список треков альбома: ");
                        }
                        System.out.println(((a + 1)) + " " + countYourBlessings2006[a] + " - прослушиваний на треке " + countCount[a] + ".");
                    }
                } else if (userCommand == 3) {
                    for (int a = 0; a < suicideSeason2008.length; a++) {
                        if (a == 0) {
                            System.out.println("Список треков альбома: ");
                        }
                        System.out.println(((a + 1)) + " " + suicideSeason2008[a] + " - прослушиваний на треке " + suicideCount[a] + ".");
                    }
                } else if (userCommand == 4) {
                    for (int a = 0; a < ThereIsAHellBelieveMe.length; a++) {
                        if (a == 0) {
                            System.out.println("Список треков альбома: ");
                        }
                        System.out.println(((a + 1)) + " " + ThereIsAHellBelieveMe[a] + " - прослушиваний на треке " + thereIsAHellCount[a] + ".");
                    }
                } else if (userCommand == 5) {
                    for (int a = 0; a < sempiternal2013.length; a++) {
                        if (a == 0) {
                            System.out.println("Список треков альбома: ");
                        }
                        System.out.println(((a + 1)) + " " + sempiternal2013[a] + " - прослушиваний на треке " + sempiternalCount[a] + ".");
                    }
                } else if (userCommand == 6) {
                    for (int a = 0; a < thatsTheSpirit2015.length; a++) {
                        if (a == 0) {
                            System.out.println("Список треков альбома: ");
                        }
                        System.out.println(((a + 1)) + " " + thatsTheSpirit2015[a] + " - прослушиваний на треке " + thatsTheCount[a] + ".");
                    }
                } else if (userCommand == 7) {
                    for (int a = 0; a < amo2019.length; a++) {
                        if (a == 0) {
                            System.out.println("Список треков альбома: ");
                        }
                        System.out.println(((a + 1)) + " " + amo2019[a] + " - прослушиваний на треке " + amoCount[a] + ".");
                    }
                } else if (userCommand == 8) {
                    for (int a = 0; a < musicTolistenToDanceToBlaze2019.length; a++) {
                        if (a == 0) {
                            System.out.println("Список треков альбома: ");
                        }
                        System.out.println(((a + 1)) + " " + musicTolistenToDanceToBlaze2019[a] + " - прослушиваний на треке " + musicToCount[a] + ".");
                    }
                } else if (userCommand == 9) {
                    for (int a = 0; a < postHumanSurvivalHorror2020.length; a++) {
                        if (a == 0) {
                            System.out.println("Список треков альбома: ");
                        }
                        System.out.println(((a + 1)) + " " + postHumanSurvivalHorror2020[a] + " - прослушиваний на треке " + postHumanCount[a] + ".");
                    }
                } else {
                    System.out.println("Такой команды не существует");
                }
                System.out.println("Нажмите 0 - чтобы вернуться к главному меню: ");
                localMenuButton = scanner.nextInt();
            }
        }
    }
}