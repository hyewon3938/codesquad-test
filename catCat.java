import java.util.Scanner;

public class catCat {

	public static void main(String[] args) {
		int caseA;

		Scanner scan = new Scanner(System.in);

		// 상황A 설정
		System.out.println("---------------------------------------------");
		System.out.println("*길을 걷다가 귀여운 고양이를 발견했다 고양이와 친해지고 싶다!");
		System.out.println("골목길로 들어가는 고양이를 따라가본다");
		System.out.println("---------------------------------------------");

		// (A1)
		System.out.println("**골목길로 들어가더니 나를 쳐다본다");
		System.out.println("1.눈인사를 한다");
		System.out.println("2.'야옹'하고 크게 소리친다");
		// (A1)선택 스캐너
		{
			caseA = scan.nextInt();

			// (A11)
			if (caseA == 1) { // 1.눈인사를 한다
				System.out.println("***고양이가 눈인사를 받아주었다");
				System.out.println("1.살며시 다가간다");
				System.out.println("2.멀리서 한동안 지켜본다");
				// (A11)선택
				caseA = scan.nextInt();

				// (A111)
				if (caseA == 1) { // 1.살며시 다가간다
					System.out.println("****고양이가 나를 빤히 쳐다본다");
					System.out.println("1.다가가서 쓰다듬는다");
					System.out.println("2.약간의 거리를 두고 가만히 앉아있는다");
					// (A111)선택
					caseA = scan.nextInt();

					// (A1111)
					if (caseA == 1) { // A1.다가가서 쓰다듬는다
						System.out.println("*****고양이가 살짝 도망간다");
						System.out.println("1.앉아서 다시 눈인사를 한다");
						System.out.println("2.다시 더 다가가서 쓰다듬는다");
						// (A1111)선택
						caseA = scan.nextInt();

						// (A11111)
						if (caseA == 1) { // 1.앉아서 다시 눈인사를 한다.
							System.out.println("******고양이가 내게 살며시 다가온다");
							System.out.println("1.손을 내밀어 손 냄새를 맡게 해준다");
							System.out.println("2.가까이 온 고양이를 쓰다듬는다");
							// (A11111)선택
							caseA = scan.nextInt();

							// (A111111)
							if (caseA == 1) { // 1.손을 내밀어 손 냄새를 맡게 해준다.
								System.out.println("*******고양이가 손냄새를 맡으며 내게 흥미를 보인다");
								System.out.println("1.고양이와 놀아줄만한 것을 찾는다");
								System.out.println("2.계속 지켜본다");
								// (A111111)선택
								caseA = scan.nextInt();

								// (A1111111)
								if (caseA == 1) { // 1.고양이와 놀아줄만한 것을 찾는다
									System.out.println("********나는 이어폰과 지갑을 가지고 있다");
									System.out.println("1.주변에서 나뭇가지를 주워와서 놀아준다");
									System.out.println("2.이어폰으로 놀아준다");
									System.out.println("3.지갑으로 놀아준다");
									// (A1111111)선택
									caseA = scan.nextInt();

									// (A11111111)
									if (caseA == 1) { // 1.주변에서 나뭇가지를 주워와서 놀아준다
										System.out.println("*********고양이가 흥미를 가지고 놀기 시작한다");
										System.out.println("1.계속 나뭇가지로 놀아준다");
										System.out.println("2.이어폰으로 놀아준다");
										System.out.println("3.지갑으로 놀아준다");
										caseA = scan.nextInt();

										// (A111111111)
										if (caseA == 1) { // 1.계속 나뭇가지로 놀아준다
											System.out.println("***********고양이의 흥미가 떨어졌다");
											System.out.println("1.나뭇가지로 계속 놀아준다");
											System.out.println("2.이어폰으로 놀아준다");
											caseA = scan.nextInt();

											// (A1111111111)10 1
											if (caseA == 1) { // 나뭇가지로 계속 놀아준다
												System.out.println("************고양이가 다른 곳으로 가버렸다");
											}

											// (A1111111112)
											else if (caseA == 2) { // 2.이어폰으로 놀아준다
												System.out.println("************고양이가 이어폰을 미친듯이 갖고 놀기 시작한다");
												System.out.println("1.고양이의 반응이 좋으니 이어폰으로 계속 놀아준다");
												System.out.println("2.이어폰이 고장날 것 같으니 그만 놀아준다");
												caseA = scan.nextInt();

												// A11111111121
												if (caseA == 1) {// 1.이어폰으로 계속 놀아준다
													System.out.println("*************고양이가 나에게 호감을 보이기 시작했다");
													System.out.println("1.고양이 머리를 쓰다듬는다");
													System.out.println("2.고양이를 배를 쓰다듬는다");
													caseA = scan.nextInt();

													// AA111111111211
													if (caseA == 1) {// 1.고양이머리를 쓰다듬는다
														System.out.println("**************고양이가 내 손에 얼굴을 부빈다");
														System.out.println("1.고양이 간식을 사온다");
														System.out.println("2.시간이 늦었으니 우선 집으로 돌아가고 내일 다시 온다");
														caseA = scan.nextInt();

														// A1111111112111
														if (caseA == 1) {// 1.고양이 간식을 사온다
															System.out.println("***************고양이가 간식을 맛있게 먹는다");
															System.out.println("1.집으로 돌아간다");
															System.out.println("2.고양이 배를 쓰다듬는다");
															caseA = scan.nextInt();

															// A11111111121111
															if (caseA == 1) {// 1.집으로 들어간다
																System.out.println("****************고양이가 집 앞까지 따라왔다");
																System.out.println("1.내일 다시 보면 되니까 우선 집에 들어간다");
																System.out.println("2.고양이와 집 앞에서 더 놀아준다");
																caseA = scan.nextInt();

																// A111111111211111
																if (caseA == 1) {// 1.집으로 들어간다
																	System.out.println(
																			"*****************고양이를 다시 볼 수 없었다");
																}
																// A111111111211112
																else if (caseA == 2) {// 2.집으로 들어간다
																	System.out.println(
																			"★★★★★★★★★★고양이의 간택을 받아 집사가 되었다★★★★★★★★★★");
																}
															}

															//// A11111111121112
															else if (caseA == 2) {// 2.고양이 배를 쓰다듬는다
																System.out.println(
																		"****************고양이가 화를 내며 다른 곳으로 가버렸다");
															}
														}

														//// A1111111112112
														else if (caseA == 2) {// 2.집에 가고 내일 다시 온다
															System.out.println("***************고양이를 다시 볼 수 없었다");
														}
													}

													//// AA111111111212
													else if (caseA == 2) {// 1.고양이 배를 쓰다듬는다
														System.out.println("**************고양이가 화를 내며 다른 곳으로 가버렸다");
													}
												}

												// A11111111122
												else if (caseA == 2) {// 2.이어폰이 고장날 것 같으니 그만 놀아준다
													System.out.println("*************고양이가 이어폰을 물고 도망가버렸다");
												}

											}
										}

										// (A111111112)9
										else if (caseA == 2) {// 2.이어폰으로 놀아준다
											System.out.println("**********고양이가 이어폰을 미친듯이 갖고 놀기 시작한다");
											System.out.println("1.고양이의 반응이 좋으니 이어폰으로 계속 놀아준다");
											System.out.println("2.이어폰이 고장날 것 같으니 그만 놀아준다");
											caseA = scan.nextInt();

											// A11111111121
											if (caseA == 1) {// 1.이어폰으로 계속 놀아준다
												System.out.println("*************고양이가 나에게 호감을 보이기 시작했다");
												System.out.println("1.고양이 머리를 쓰다듬는다");
												System.out.println("2.고양이를 배를 쓰다듬는다");
												caseA = scan.nextInt();

												// AA111111111211
												if (caseA == 1) {// 1.고양이머리를 쓰다듬는다
													System.out.println("**************고양이가 내 손에 얼굴을 부빈다");
													System.out.println("1.고양이 간식을 사온다");
													System.out.println("2.시간이 늦었으니 우선 집으로 돌아가고 내일 다시 온다");
													caseA = scan.nextInt();

													// A1111111112111
													if (caseA == 1) {// 1.고양이 간식을 사온다
														System.out.println("***************고양이가 간식을 맛있게 먹는다");
														System.out.println("1.집으로 돌아간다");
														System.out.println("2.고양이 배를 쓰다듬는다");
														caseA = scan.nextInt();

														// A11111111121111
														if (caseA == 1) {// 1.집으로 들어간다
															System.out.println("****************고양이가 집 앞까지 따라왔다");
															System.out.println("1.내일 다시 보면 되니까 우선 집에 들어간다");
															System.out.println("2.고양이와 집 앞에서 더 놀아준다");
															caseA = scan.nextInt();

															// A111111111211111
															if (caseA == 1) {// 1.집으로 들어간다
																System.out.println("*****************고양이를 다시 볼 수 없었다");
															}
															// A111111111211112
															else if (caseA == 2) {// 2.집으로 들어간다
																System.out.println(
																		"★★★★★★★★★★고양이의 간택을 받아 집사가 되었다★★★★★★★★★★");
															}
														}

														//// A11111111121112
														else if (caseA == 2) {// 2.고양이 배를 쓰다듬는다
															System.out
																	.println("****************고양이가 화를 내며 다른 곳으로 가버렸다");
														}
													}

													//// A1111111112112
													else if (caseA == 2) {// 2.집에 가고 내일 다시 온다
														System.out.println("***************고양이를 다시 볼 수 없었다");
													}
												}

												//// AA111111111212
												else if (caseA == 2) {// 1.고양이 배를 쓰다듬는다
													System.out.println("**************고양이가 화를 내며 다른 곳으로 가버렸다");
												}
											}

											// A11111111122
											else if (caseA == 2) {// 2.이어폰이 고장날 것 같으니 그만 놀아준다
												System.out.println("*************고양이가 이어폰을 물고 도망가버렸다");
											}

										}
									}

									// (A11111112)
									else if (caseA == 2) { // 2.이어폰으로 놀아준다
										System.out.println("*********고양이가 이어폰을 미친듯이 갖고 놀기 시작한다");
										System.out.println("1.고양이의 반응이 좋으니 이어폰으로 계속 놀아준다");
										System.out.println("2.이어폰이 고장날 것 같으니 그만 놀아준다");
										caseA = scan.nextInt();

										// A11111111121
										if (caseA == 1) {// 1.이어폰으로 계속 놀아준다
											System.out.println("*************고양이가 나에게 호감을 보이기 시작했다");
											System.out.println("1.고양이 머리를 쓰다듬는다");
											System.out.println("2.고양이를 배를 쓰다듬는다");
											caseA = scan.nextInt();

											// AA111111111211
											if (caseA == 1) {// 1.고양이머리를 쓰다듬는다
												System.out.println("**************고양이가 내 손에 얼굴을 부빈다");
												System.out.println("1.고양이 간식을 사온다");
												System.out.println("2.시간이 늦었으니 우선 집으로 돌아가고 내일 다시 온다");
												caseA = scan.nextInt();

												// A1111111112111
												if (caseA == 1) {// 1.고양이 간식을 사온다
													System.out.println("***************고양이가 간식을 맛있게 먹는다");
													System.out.println("1.집으로 돌아간다");
													System.out.println("2.고양이 배를 쓰다듬는다");
													caseA = scan.nextInt();

													// A11111111121111
													if (caseA == 1) {// 1.집으로 들어간다
														System.out.println("****************고양이가 집 앞까지 따라왔다");
														System.out.println("1.내일 다시 보면 되니까 우선 집에 들어간다");
														System.out.println("2.고양이와 집 앞에서 더 놀아준다");
														caseA = scan.nextInt();

														// A111111111211111
														if (caseA == 1) {// 1.집으로 들어간다
															System.out.println("*****************고양이를 다시 볼 수 없었다");
														}
														// A111111111211112
														else if (caseA == 2) {// 2.집으로 들어간다
															System.out
																	.println("★★★★★★★★★★고양이의 간택을 받아 집사가 되었다★★★★★★★★★★");
														}
													}

													//// A11111111121112
													else if (caseA == 2) {// 2.고양이 배를 쓰다듬는다
														System.out.println("****************고양이가 화를 내며 다른 곳으로 가버렸다");
													}
												}

												//// A1111111112112
												else if (caseA == 2) {// 2.집에 가고 내일 다시 온다
													System.out.println("***************고양이를 다시 볼 수 없었다");
												}
											}

											//// AA111111111212
											else if (caseA == 2) {// 1.고양이 배를 쓰다듬는다
												System.out.println("**************고양이가 화를 내며 다른 곳으로 가버렸다");
											}
										}

										// A11111111122
										else if (caseA == 2) {// 2.이어폰이 고장날 것 같으니 그만 놀아준다
											System.out.println("*************고양이가 이어폰을 물고 도망가버렸다");
										}
									}

									// (A11111113)
									else if (caseA == 3) { // 3.지갑으로 놀아준다
										System.out.println("*********지갑을 던져주니 고양이가 지갑을 그냥 툭툭 친다");
										System.out.println("1.지갑을 다시 던진다 ");
										System.out.println("2.지갑을 그대로 두고 고양이의 반응을 본다");
										caseA = scan.nextInt();

										// A1111111131
										if (caseA == 1) {// 1.지갑을 다시 던진다
											System.out.println("***********고양이가 다른 곳으로 가버렸다");
										}

										// A1111111132
										else if (caseA == 2) {// 2.지갑 두고 고양이 반응보기
											System.out.println("***********고양이가 다른 곳으로 가버렸다");
										}
									}
								}

								// (A1111112)

								else if (caseA == 2) { // 2.계속 지켜본다
									System.out.println("********고양이가 금방 흥미를 잃고 다른 곳으로 가버렸다");
								}
							}

							// (A111112)
							else if (caseA == 2) {// 2.가까이 온 고양이를 쓰다듬는다.
								System.out.println("*******고양이가 도망가버렸다");
							}
						}

						// (A11112)
						else if (caseA == 2) { // A1-1-1-1-2.다시 더 다가가서 쓰다듬는다
							System.out.println("******고양이가 도망가버렸다");
						}
					}

					// (A1112)
					else if (caseA == 2) { // 2.약간의 거리를 두고 가만히 앉아있는다
						System.out.println("*****고양이가 내 가까이 와서 내 냄새를 맡는다");
						System.out.println("1.손을 내밀어 손 냄새를 맡게 해준다");
						System.out.println("2.가까이 온 고양이를 쓰다듬는다");
						// (A1112)선택
						caseA = scan.nextInt();

						if (caseA == 1) { // 1.손을 내밀어 손 냄새를 맡게 해준다.
							System.out.println("*******고양이가 손냄새를 맡으며 내게 흥미를 보인다");
							System.out.println("1.고양이와 놀아줄만한 것을 찾는다");
							System.out.println("2.계속 지켜본다");
							// (A111111)선택
							caseA = scan.nextInt();

							// (A1111111)
							if (caseA == 1) { // 1.고양이와 놀아줄만한 것을 찾는다
								System.out.println("********나는 이어폰과 지갑을 가지고 있다");
								System.out.println("1.주변에서 나뭇가지를 주워와서 놀아준다");
								System.out.println("2.이어폰으로 놀아준다");
								System.out.println("3.지갑으로 놀아준다");
								// (A1111111)선택
								caseA = scan.nextInt();

								// (A11111111)
								if (caseA == 1) { // 1.주변에서 나뭇가지를 주워와서 놀아준다
									System.out.println("*********고양이가 흥미를 가지고 놀기 시작한다");
									System.out.println("1.계속 나뭇가지로 놀아준다");
									System.out.println("2.이어폰으로 놀아준다");
									System.out.println("3.지갑으로 놀아준다");
									caseA = scan.nextInt();

									// (A111111111)
									if (caseA == 1) { // 1.계속 나뭇가지로 놀아준다
										System.out.println("***********고양이의 흥미가 떨어졌다");
										System.out.println("1.나뭇가지로 계속 놀아준다");
										System.out.println("2.이어폰으로 놀아준다");
										caseA = scan.nextInt();

										// (A1111111111)10 1
										if (caseA == 1) { // 나뭇가지로 계속 놀아준다
											System.out.println("************고양이가 다른 곳으로 가버렸다");
										}

										// (A1111111112)
										else if (caseA == 2) { // 2.이어폰으로 놀아준다
											System.out.println("************고양이가 이어폰을 미친듯이 갖고 놀기 시작한다");
											System.out.println("1.고양이의 반응이 좋으니 이어폰으로 계속 놀아준다");
											System.out.println("2.이어폰이 고장날 것 같으니 그만 놀아준다");
											caseA = scan.nextInt();

											// A11111111121
											if (caseA == 1) {// 1.이어폰으로 계속 놀아준다
												System.out.println("*************고양이가 나에게 호감을 보이기 시작했다");
												System.out.println("1.고양이 머리를 쓰다듬는다");
												System.out.println("2.고양이를 배를 쓰다듬는다");
												caseA = scan.nextInt();

												// AA111111111211
												if (caseA == 1) {// 1.고양이머리를 쓰다듬는다
													System.out.println("**************고양이가 내 손에 얼굴을 부빈다");
													System.out.println("1.고양이 간식을 사온다");
													System.out.println("2.시간이 늦었으니 우선 집으로 돌아가고 내일 다시 온다");
													caseA = scan.nextInt();

													// A1111111112111
													if (caseA == 1) {// 1.고양이 간식을 사온다
														System.out.println("***************고양이가 간식을 맛있게 먹는다");
														System.out.println("1.집으로 돌아간다");
														System.out.println("2.고양이 배를 쓰다듬는다");
														caseA = scan.nextInt();

														// A11111111121111
														if (caseA == 1) {// 1.집으로 들어간다
															System.out.println("****************고양이가 집 앞까지 따라왔다");
															System.out.println("1.내일 다시 보면 되니까 우선 집에 들어간다");
															System.out.println("2.고양이와 집 앞에서 더 놀아준다");
															caseA = scan.nextInt();

															// A111111111211111
															if (caseA == 1) {// 1.집으로 들어간다
																System.out.println("*****************고양이를 다시 볼 수 없었다");
															}
															// A111111111211112
															else if (caseA == 2) {// 2.집으로 들어간다
																System.out.println(
																		"★★★★★★★★★★고양이의 간택을 받아 집사가 되었다★★★★★★★★★★");
															}
														}

														//// A11111111121112
														else if (caseA == 2) {// 2.고양이 배를 쓰다듬는다
															System.out
																	.println("****************고양이가 화를 내며 다른 곳으로 가버렸다");
														}
													}

													//// A1111111112112
													else if (caseA == 2) {// 2.집에 가고 내일 다시 온다
														System.out.println("***************고양이를 다시 볼 수 없었다");
													}
												}

												//// AA111111111212
												else if (caseA == 2) {// 1.고양이 배를 쓰다듬는다
													System.out.println("**************고양이가 화를 내며 다른 곳으로 가버렸다");
												}
											}

											// A11111111122
											else if (caseA == 2) {// 2.이어폰이 고장날 것 같으니 그만 놀아준다
												System.out.println("*************고양이가 이어폰을 물고 도망가버렸다");
											}

										}
									}

									// (A111111112)9
									else if (caseA == 2) {// 2.이어폰으로 놀아준다
										System.out.println("**********고양이가 이어폰을 미친듯이 갖고 놀기 시작한다");
										System.out.println("1.고양이의 반응이 좋으니 이어폰으로 계속 놀아준다");
										System.out.println("2.이어폰이 고장날 것 같으니 그만 놀아준다");
										caseA = scan.nextInt();

										// A11111111121
										if (caseA == 1) {// 1.이어폰으로 계속 놀아준다
											System.out.println("*************고양이가 나에게 호감을 보이기 시작했다");
											System.out.println("1.고양이 머리를 쓰다듬는다");
											System.out.println("2.고양이를 배를 쓰다듬는다");
											caseA = scan.nextInt();

											// AA111111111211
											if (caseA == 1) {// 1.고양이머리를 쓰다듬는다
												System.out.println("**************고양이가 내 손에 얼굴을 부빈다");
												System.out.println("1.고양이 간식을 사온다");
												System.out.println("2.시간이 늦었으니 우선 집으로 돌아가고 내일 다시 온다");
												caseA = scan.nextInt();

												// A1111111112111
												if (caseA == 1) {// 1.고양이 간식을 사온다
													System.out.println("***************고양이가 간식을 맛있게 먹는다");
													System.out.println("1.집으로 돌아간다");
													System.out.println("2.고양이 배를 쓰다듬는다");
													caseA = scan.nextInt();

													// A11111111121111
													if (caseA == 1) {// 1.집으로 들어간다
														System.out.println("****************고양이가 집 앞까지 따라왔다");
														System.out.println("1.내일 다시 보면 되니까 우선 집에 들어간다");
														System.out.println("2.고양이와 집 앞에서 더 놀아준다");
														caseA = scan.nextInt();

														// A111111111211111
														if (caseA == 1) {// 1.집으로 들어간다
															System.out.println("*****************고양이를 다시 볼 수 없었다");
														}
														// A111111111211112
														else if (caseA == 2) {// 2.집으로 들어간다
															System.out
																	.println("★★★★★★★★★★고양이의 간택을 받아 집사가 되었다★★★★★★★★★★");
														}
													}

													//// A11111111121112
													else if (caseA == 2) {// 2.고양이 배를 쓰다듬는다
														System.out.println("****************고양이가 화를 내며 다른 곳으로 가버렸다");
													}
												}

												//// A1111111112112
												else if (caseA == 2) {// 2.집에 가고 내일 다시 온다
													System.out.println("***************고양이를 다시 볼 수 없었다");
												}
											}

											//// AA111111111212
											else if (caseA == 2) {// 1.고양이 배를 쓰다듬는다
												System.out.println("**************고양이가 화를 내며 다른 곳으로 가버렸다");
											}
										}

										// A11111111122
										else if (caseA == 2) {// 2.이어폰이 고장날 것 같으니 그만 놀아준다
											System.out.println("*************고양이가 이어폰을 물고 도망가버렸다");
										}

									}
								}

								// (A11111112)
								else if (caseA == 2) { // 2.이어폰으로 놀아준다
									System.out.println("*********고양이가 이어폰을 미친듯이 갖고 놀기 시작한다");
									System.out.println("1.고양이의 반응이 좋으니 이어폰으로 계속 놀아준다");
									System.out.println("2.이어폰이 고장날 것 같으니 그만 놀아준다");
									caseA = scan.nextInt();

									// A11111111121
									if (caseA == 1) {// 1.이어폰으로 계속 놀아준다
										System.out.println("*************고양이가 나에게 호감을 보이기 시작했다");
										System.out.println("1.고양이 머리를 쓰다듬는다");
										System.out.println("2.고양이를 배를 쓰다듬는다");
										caseA = scan.nextInt();

										// AA111111111211
										if (caseA == 1) {// 1.고양이머리를 쓰다듬는다
											System.out.println("**************고양이가 내 손에 얼굴을 부빈다");
											System.out.println("1.고양이 간식을 사온다");
											System.out.println("2.시간이 늦었으니 우선 집으로 돌아가고 내일 다시 온다");
											caseA = scan.nextInt();

											// A1111111112111
											if (caseA == 1) {// 1.고양이 간식을 사온다
												System.out.println("***************고양이가 간식을 맛있게 먹는다");
												System.out.println("1.집으로 돌아간다");
												System.out.println("2.고양이 배를 쓰다듬는다");
												caseA = scan.nextInt();

												// A11111111121111
												if (caseA == 1) {// 1.집으로 들어간다
													System.out.println("****************고양이가 집 앞까지 따라왔다");
													System.out.println("1.내일 다시 보면 되니까 우선 집에 들어간다");
													System.out.println("2.고양이와 집 앞에서 더 놀아준다");
													caseA = scan.nextInt();

													// A111111111211111
													if (caseA == 1) {// 1.집으로 들어간다
														System.out.println("*****************고양이를 다시 볼 수 없었다");
													}
													// A111111111211112
													else if (caseA == 2) {// 2.집으로 들어간다
														System.out.println("★★★★★★★★★★고양이의 간택을 받아 집사가 되었다★★★★★★★★★★");
													}
												}

												//// A11111111121112
												else if (caseA == 2) {// 2.고양이 배를 쓰다듬는다
													System.out.println("****************고양이가 화를 내며 다른 곳으로 가버렸다");
												}
											}

											//// A1111111112112
											else if (caseA == 2) {// 2.집에 가고 내일 다시 온다
												System.out.println("***************고양이를 다시 볼 수 없었다");
											}
										}

										//// AA111111111212
										else if (caseA == 2) {// 1.고양이 배를 쓰다듬는다
											System.out.println("**************고양이가 화를 내며 다른 곳으로 가버렸다");
										}
									}

									// A11111111122
									else if (caseA == 2) {// 2.이어폰이 고장날 것 같으니 그만 놀아준다
										System.out.println("*************고양이가 이어폰을 물고 도망가버렸다");
									}
								}

								// (A11111113)
								else if (caseA == 3) { // 3.지갑으로 놀아준다
									System.out.println("*********지갑을 던져주니 고양이가 지갑을 그냥 툭툭 친다");
									System.out.println("1.지갑을 다시 던진다 ");
									System.out.println("2.지갑을 그대로 두고 고양이의 반응을 본다");
									caseA = scan.nextInt();

									// A1111111131
									if (caseA == 1) {// 1.지갑을 다시 던진다
										System.out.println("***********고양이가 다른 곳으로 가버렸다");
									}

									// A1111111132
									else if (caseA == 2) {// 2.지갑 두고 고양이 반응보기
										System.out.println("***********고양이가 다른 곳으로 가버렸다");
									}
								}
							}

							// (A1111112)

							else if (caseA == 2) { // 2.계속 지켜본다
								System.out.println("********고양이가 금방 흥미를 잃고 다른 곳으로 가버렸다");
							}
						}

						// (A111112)
						else if (caseA == 2) {// 2.가까이 온 고양이를 쓰다듬는다.
							System.out.println("*******고양이가 도망가버렸다");
						}

					}
				}

				// (A112)
				else if (caseA == 2) { // 2.멀리서 한동안 지켜본다
					System.out.println("****고양이가 나에게 흥미를 가지기 시작했다");
					System.out.println("1.고양이와 놀아줄만한 것을 찾는다");
					System.out.println("2.계속 지켜본다");
					// (A112)선택
					caseA = scan.nextInt();

					if (caseA == 1) { // 1.고양이와 놀아줄만한 것을 찾는다
						System.out.println("********나는 이어폰과 지갑을 가지고 있다");
						System.out.println("1.주변에서 나뭇가지를 주워와서 놀아준다");
						System.out.println("2.이어폰으로 놀아준다");
						System.out.println("3.지갑으로 놀아준다");
						// (A1111111)선택
						caseA = scan.nextInt();

						// (A11111111)
						if (caseA == 1) { // 1.주변에서 나뭇가지를 주워와서 놀아준다
							System.out.println("*********고양이가 흥미를 가지고 놀기 시작한다");
							System.out.println("1.계속 나뭇가지로 놀아준다");
							System.out.println("2.이어폰으로 놀아준다");
							System.out.println("3.지갑으로 놀아준다");
							caseA = scan.nextInt();

							// (A111111111)
							if (caseA == 1) { // 1.계속 나뭇가지로 놀아준다
								System.out.println("***********고양이의 흥미가 떨어졌다");
								System.out.println("1.나뭇가지로 계속 놀아준다");
								System.out.println("2.이어폰으로 놀아준다");
								caseA = scan.nextInt();

								// (A1111111111)10 1
								if (caseA == 1) { // 나뭇가지로 계속 놀아준다
									System.out.println("************고양이가 다른 곳으로 가버렸다");
								}

								// (A1111111112)
								else if (caseA == 2) { // 2.이어폰으로 놀아준다
									System.out.println("************고양이가 이어폰을 미친듯이 갖고 놀기 시작한다");
									System.out.println("1.고양이의 반응이 좋으니 이어폰으로 계속 놀아준다");
									System.out.println("2.이어폰이 고장날 것 같으니 그만 놀아준다");
									caseA = scan.nextInt();

									// A11111111121
									if (caseA == 1) {// 1.이어폰으로 계속 놀아준다
										System.out.println("*************고양이가 나에게 호감을 보이기 시작했다");
										System.out.println("1.고양이 머리를 쓰다듬는다");
										System.out.println("2.고양이를 배를 쓰다듬는다");
										caseA = scan.nextInt();

										// AA111111111211
										if (caseA == 1) {// 1.고양이머리를 쓰다듬는다
											System.out.println("**************고양이가 내 손에 얼굴을 부빈다");
											System.out.println("1.고양이 간식을 사온다");
											System.out.println("2.시간이 늦었으니 우선 집으로 돌아가고 내일 다시 온다");
											caseA = scan.nextInt();

											// A1111111112111
											if (caseA == 1) {// 1.고양이 간식을 사온다
												System.out.println("***************고양이가 간식을 맛있게 먹는다");
												System.out.println("1.집으로 돌아간다");
												System.out.println("2.고양이 배를 쓰다듬는다");
												caseA = scan.nextInt();

												// A11111111121111
												if (caseA == 1) {// 1.집으로 들어간다
													System.out.println("****************고양이가 집 앞까지 따라왔다");
													System.out.println("1.내일 다시 보면 되니까 우선 집에 들어간다");
													System.out.println("2.고양이와 집 앞에서 더 놀아준다");
													caseA = scan.nextInt();

													// A111111111211111
													if (caseA == 1) {// 1.집으로 들어간다
														System.out.println("*****************고양이를 다시 볼 수 없었다");
													}
													// A111111111211112
													else if (caseA == 2) {// 2.집으로 들어간다
														System.out.println("★★★★★★★★★★고양이의 간택을 받아 집사가 되었다★★★★★★★★★★");
													}
												}

												//// A11111111121112
												else if (caseA == 2) {// 2.고양이 배를 쓰다듬는다
													System.out.println("****************고양이가 화를 내며 다른 곳으로 가버렸다");
												}
											}

											//// A1111111112112
											else if (caseA == 2) {// 2.집에 가고 내일 다시 온다
												System.out.println("***************고양이를 다시 볼 수 없었다");
											}
										}

										//// AA111111111212
										else if (caseA == 2) {// 1.고양이 배를 쓰다듬는다
											System.out.println("**************고양이가 화를 내며 다른 곳으로 가버렸다");
										}
									}

									// A11111111122
									else if (caseA == 2) {// 2.이어폰이 고장날 것 같으니 그만 놀아준다
										System.out.println("*************고양이가 이어폰을 물고 도망가버렸다");
									}

								}
							}

							// (A111111112)9
							else if (caseA == 2) {// 2.이어폰으로 놀아준다
								System.out.println("**********고양이가 이어폰을 미친듯이 갖고 놀기 시작한다");
								System.out.println("1.고양이의 반응이 좋으니 이어폰으로 계속 놀아준다");
								System.out.println("2.이어폰이 고장날 것 같으니 그만 놀아준다");
								caseA = scan.nextInt();

								// A11111111121
								if (caseA == 1) {// 1.이어폰으로 계속 놀아준다
									System.out.println("*************고양이가 나에게 호감을 보이기 시작했다");
									System.out.println("1.고양이 머리를 쓰다듬는다");
									System.out.println("2.고양이를 배를 쓰다듬는다");
									caseA = scan.nextInt();

									// AA111111111211
									if (caseA == 1) {// 1.고양이머리를 쓰다듬는다
										System.out.println("**************고양이가 내 손에 얼굴을 부빈다");
										System.out.println("1.고양이 간식을 사온다");
										System.out.println("2.시간이 늦었으니 우선 집으로 돌아가고 내일 다시 온다");
										caseA = scan.nextInt();

										// A1111111112111
										if (caseA == 1) {// 1.고양이 간식을 사온다
											System.out.println("***************고양이가 간식을 맛있게 먹는다");
											System.out.println("1.집으로 돌아간다");
											System.out.println("2.고양이 배를 쓰다듬는다");
											caseA = scan.nextInt();

											// A11111111121111
											if (caseA == 1) {// 1.집으로 들어간다
												System.out.println("****************고양이가 집 앞까지 따라왔다");
												System.out.println("1.내일 다시 보면 되니까 우선 집에 들어간다");
												System.out.println("2.고양이와 집 앞에서 더 놀아준다");
												caseA = scan.nextInt();

												// A111111111211111
												if (caseA == 1) {// 1.집으로 들어간다
													System.out.println("*****************고양이를 다시 볼 수 없었다");
												}
												// A111111111211112
												else if (caseA == 2) {// 2.집으로 들어간다
													System.out.println("★★★★★★★★★★고양이의 간택을 받아 집사가 되었다★★★★★★★★★★");
												}
											}

											//// A11111111121112
											else if (caseA == 2) {// 2.고양이 배를 쓰다듬는다
												System.out.println("****************고양이가 화를 내며 다른 곳으로 가버렸다");
											}
										}

										//// A1111111112112
										else if (caseA == 2) {// 2.집에 가고 내일 다시 온다
											System.out.println("***************고양이를 다시 볼 수 없었다");
										}
									}

									//// AA111111111212
									else if (caseA == 2) {// 1.고양이 배를 쓰다듬는다
										System.out.println("**************고양이가 화를 내며 다른 곳으로 가버렸다");
									}
								}

								// A11111111122
								else if (caseA == 2) {// 2.이어폰이 고장날 것 같으니 그만 놀아준다
									System.out.println("*************고양이가 이어폰을 물고 도망가버렸다");
								}

							}
						}

						// (A11111112)
						else if (caseA == 2) { // 2.이어폰으로 놀아준다
							System.out.println("*********고양이가 이어폰을 미친듯이 갖고 놀기 시작한다");
							System.out.println("1.고양이의 반응이 좋으니 이어폰으로 계속 놀아준다");
							System.out.println("2.이어폰이 고장날 것 같으니 그만 놀아준다");
							caseA = scan.nextInt();

							// A11111111121
							if (caseA == 1) {// 1.이어폰으로 계속 놀아준다
								System.out.println("*************고양이가 나에게 호감을 보이기 시작했다");
								System.out.println("1.고양이 머리를 쓰다듬는다");
								System.out.println("2.고양이를 배를 쓰다듬는다");
								caseA = scan.nextInt();

								// AA111111111211
								if (caseA == 1) {// 1.고양이머리를 쓰다듬는다
									System.out.println("**************고양이가 내 손에 얼굴을 부빈다");
									System.out.println("1.고양이 간식을 사온다");
									System.out.println("2.시간이 늦었으니 우선 집으로 돌아가고 내일 다시 온다");
									caseA = scan.nextInt();

									// A1111111112111
									if (caseA == 1) {// 1.고양이 간식을 사온다
										System.out.println("***************고양이가 간식을 맛있게 먹는다");
										System.out.println("1.집으로 돌아간다");
										System.out.println("2.고양이 배를 쓰다듬는다");
										caseA = scan.nextInt();

										// A11111111121111
										if (caseA == 1) {// 1.집으로 들어간다
											System.out.println("****************고양이가 집 앞까지 따라왔다");
											System.out.println("1.내일 다시 보면 되니까 우선 집에 들어간다");
											System.out.println("2.고양이와 집 앞에서 더 놀아준다");
											caseA = scan.nextInt();

											// A111111111211111
											if (caseA == 1) {// 1.집으로 들어간다
												System.out.println("*****************고양이를 다시 볼 수 없었다");
											}
											// A111111111211112
											else if (caseA == 2) {// 2.집으로 들어간다
												System.out.println("★★★★★★★★★★고양이의 간택을 받아 집사가 되었다★★★★★★★★★★");
											}
										}

										//// A11111111121112
										else if (caseA == 2) {// 2.고양이 배를 쓰다듬는다
											System.out.println("****************고양이가 화를 내며 다른 곳으로 가버렸다");
										}
									}

									//// A1111111112112
									else if (caseA == 2) {// 2.집에 가고 내일 다시 온다
										System.out.println("***************고양이를 다시 볼 수 없었다");
									}
								}

								//// AA111111111212
								else if (caseA == 2) {// 1.고양이 배를 쓰다듬는다
									System.out.println("**************고양이가 화를 내며 다른 곳으로 가버렸다");
								}
							}

							// A11111111122
							else if (caseA == 2) {// 2.이어폰이 고장날 것 같으니 그만 놀아준다
								System.out.println("*************고양이가 이어폰을 물고 도망가버렸다");
							}
						}

						// (A11111113)
						else if (caseA == 3) { // 3.지갑으로 놀아준다
							System.out.println("*********지갑을 던져주니 고양이가 지갑을 그냥 툭툭 친다");
							System.out.println("1.지갑을 다시 던진다 ");
							System.out.println("2.지갑을 그대로 두고 고양이의 반응을 본다");
							caseA = scan.nextInt();

							// A1111111131
							if (caseA == 1) {// 1.지갑을 다시 던진다
								System.out.println("***********고양이가 다른 곳으로 가버렸다");
							}

							// A1111111132
							else if (caseA == 2) {// 2.지갑 두고 고양이 반응보기
								System.out.println("***********고양이가 다른 곳으로 가버렸다");
							}
						}
					}

					// (A1111112)

					else if (caseA == 2) { // 2.계속 지켜본다
						System.out.println("********고양이가 금방 흥미를 잃고 다른 곳으로 가버렸다");
					}
				}

			}

			// ---------------------------------------------------------------------------------------------------------

			// (A12)
			else if (caseA == 2) { // 2.'야옹'하고 크게 소리친다
				System.out.println("***고양이가 멀리 도망가버렸다");
				System.out.println("1.고양이를 찾아나선다");
				System.out.println("2.그 자리에서 고양이를 기다린다");
				// (A12)선택
				caseA = scan.nextInt();

				// (A121)
				if (caseA == 1) { // 1.고양이를 찾아나선다
					System.out.println("****고양이가 보이지 않는다");
					System.out.println("1.포기하고 돌아간다");
					System.out.println("2.더 깊은 골목으로 들어간다");
					// (A121)선택
					caseA = scan.nextInt();

					// (A1211)
					if (caseA == 1) { // A1-2-1-1.포기하고 돌아간다
						System.out.println("*****고양이를 그 뒤로 다시 보지 못 했다");
					}

					// (A1212)
					else if (caseA == 2) { // A1-2-1-2.더 깊은 골목으로 들어간다
						System.out.println("*****아까 그 고양이를 발견했다");
						System.out.println("1.몸을 낮춰서 눈인사를 한다");
						System.out.println("2.고양이에게 가까이 다가간다");
						// (A1212)선택
						caseA = scan.nextInt();

						// A12121 
						if (caseA == 1) { // A1-2-1-1.몸을 낮춰서 눈인사를 한다
							System.out.println("*****고양이가 경계를 풀고 내게 가까이 온다");
							System.out.println("1.손을 내밀어 손 냄새를 맡게 한다");
							System.out.println("2.가까이 온 고양이를 쓰다듬는다");
							caseA = scan.nextInt();
							
							if(caseA == 1) { // 1.손을 내밀어 손 냄새를 맡게 해준다.
								System.out.println("*******고양이가 손냄새를 맡으며 내게 흥미를 보인다");
								System.out.println("1.고양이와 놀아줄만한 것을 찾는다");
								System.out.println("2.계속 지켜본다");
								// (A111111)선택
								caseA = scan.nextInt();

								// (A1111111)
								if (caseA == 1) { // 1.고양이와 놀아줄만한 것을 찾는다
									System.out.println("********나는 이어폰과 지갑을 가지고 있다");
									System.out.println("1.주변에서 나뭇가지를 주워와서 놀아준다");
									System.out.println("2.이어폰으로 놀아준다");
									System.out.println("3.지갑으로 놀아준다");
									// (A1111111)선택
									caseA = scan.nextInt();

									// (A11111111)
									if (caseA == 1) { // 1.주변에서 나뭇가지를 주워와서 놀아준다
										System.out.println("*********고양이가 흥미를 가지고 놀기 시작한다");
										System.out.println("1.계속 나뭇가지로 놀아준다");
										System.out.println("2.이어폰으로 놀아준다");
										System.out.println("3.지갑으로 놀아준다");
										caseA = scan.nextInt();

										// (A111111111)
										if (caseA == 1) { // 1.계속 나뭇가지로 놀아준다
											System.out.println("***********고양이의 흥미가 떨어졌다");
											System.out.println("1.나뭇가지로 계속 놀아준다");
											System.out.println("2.이어폰으로 놀아준다");
											caseA = scan.nextInt();

											// (A1111111111)10 1
											if (caseA == 1) { // 나뭇가지로 계속 놀아준다
												System.out.println("************고양이가 다른 곳으로 가버렸다");
											}

											// (A1111111112)
											else if (caseA == 2) { // 2.이어폰으로 놀아준다
												System.out.println("************고양이가 이어폰을 미친듯이 갖고 놀기 시작한다");
												System.out.println("1.고양이의 반응이 좋으니 이어폰으로 계속 놀아준다");
												System.out.println("2.이어폰이 고장날 것 같으니 그만 놀아준다");
												caseA = scan.nextInt();

												// A11111111121
												if (caseA == 1) {// 1.이어폰으로 계속 놀아준다
													System.out.println("*************고양이가 나에게 호감을 보이기 시작했다");
													System.out.println("1.고양이 머리를 쓰다듬는다");
													System.out.println("2.고양이를 배를 쓰다듬는다");
													caseA = scan.nextInt();

													// AA111111111211
													if (caseA == 1) {// 1.고양이머리를 쓰다듬는다
														System.out.println("**************고양이가 내 손에 얼굴을 부빈다");
														System.out.println("1.고양이 간식을 사온다");
														System.out.println("2.시간이 늦었으니 우선 집으로 돌아가고 내일 다시 온다");
														caseA = scan.nextInt();

														// A1111111112111
														if (caseA == 1) {// 1.고양이 간식을 사온다
															System.out.println("***************고양이가 간식을 맛있게 먹는다");
															System.out.println("1.집으로 돌아간다");
															System.out.println("2.고양이 배를 쓰다듬는다");
															caseA = scan.nextInt();

															// A11111111121111
															if (caseA == 1) {// 1.집으로 들어간다
																System.out.println("****************고양이가 집 앞까지 따라왔다");
																System.out.println("1.내일 다시 보면 되니까 우선 집에 들어간다");
																System.out.println("2.고양이와 집 앞에서 더 놀아준다");
																caseA = scan.nextInt();

																// A111111111211111
																if (caseA == 1) {// 1.집으로 들어간다
																	System.out.println(
																			"*****************고양이를 다시 볼 수 없었다");
																}
																// A111111111211112
																else if (caseA == 2) {// 2.집으로 들어간다
																	System.out.println(
																			"★★★★★★★★★★고양이의 간택을 받아 집사가 되었다★★★★★★★★★★");
																}
															}

															//// A11111111121112
															else if (caseA == 2) {// 2.고양이 배를 쓰다듬는다
																System.out.println(
																		"****************고양이가 화를 내며 다른 곳으로 가버렸다");
															}
														}

														//// A1111111112112
														else if (caseA == 2) {// 2.집에 가고 내일 다시 온다
															System.out.println("***************고양이를 다시 볼 수 없었다");
														}
													}

													//// AA111111111212
													else if (caseA == 2) {// 1.고양이 배를 쓰다듬는다
														System.out.println("**************고양이가 화를 내며 다른 곳으로 가버렸다");
													}
												}

												// A11111111122
												else if (caseA == 2) {// 2.이어폰이 고장날 것 같으니 그만 놀아준다
													System.out.println("*************고양이가 이어폰을 물고 도망가버렸다");
												}

											}
										}

										// (A111111112)9
										else if (caseA == 2) {// 2.이어폰으로 놀아준다
											System.out.println("**********고양이가 이어폰을 미친듯이 갖고 놀기 시작한다");
											System.out.println("1.고양이의 반응이 좋으니 이어폰으로 계속 놀아준다");
											System.out.println("2.이어폰이 고장날 것 같으니 그만 놀아준다");
											caseA = scan.nextInt();

											// A11111111121
											if (caseA == 1) {// 1.이어폰으로 계속 놀아준다
												System.out.println("*************고양이가 나에게 호감을 보이기 시작했다");
												System.out.println("1.고양이 머리를 쓰다듬는다");
												System.out.println("2.고양이를 배를 쓰다듬는다");
												caseA = scan.nextInt();

												// AA111111111211
												if (caseA == 1) {// 1.고양이머리를 쓰다듬는다
													System.out.println("**************고양이가 내 손에 얼굴을 부빈다");
													System.out.println("1.고양이 간식을 사온다");
													System.out.println("2.시간이 늦었으니 우선 집으로 돌아가고 내일 다시 온다");
													caseA = scan.nextInt();

													// A1111111112111
													if (caseA == 1) {// 1.고양이 간식을 사온다
														System.out.println("***************고양이가 간식을 맛있게 먹는다");
														System.out.println("1.집으로 돌아간다");
														System.out.println("2.고양이 배를 쓰다듬는다");
														caseA = scan.nextInt();

														// A11111111121111
														if (caseA == 1) {// 1.집으로 들어간다
															System.out.println("****************고양이가 집 앞까지 따라왔다");
															System.out.println("1.내일 다시 보면 되니까 우선 집에 들어간다");
															System.out.println("2.고양이와 집 앞에서 더 놀아준다");
															caseA = scan.nextInt();

															// A111111111211111
															if (caseA == 1) {// 1.집으로 들어간다
																System.out.println("*****************고양이를 다시 볼 수 없었다");
															}
															// A111111111211112
															else if (caseA == 2) {// 2.집으로 들어간다
																System.out.println(
																		"★★★★★★★★★★고양이의 간택을 받아 집사가 되었다★★★★★★★★★★");
															}
														}

														//// A11111111121112
														else if (caseA == 2) {// 2.고양이 배를 쓰다듬는다
															System.out
																	.println("****************고양이가 화를 내며 다른 곳으로 가버렸다");
														}
													}

													//// A1111111112112
													else if (caseA == 2) {// 2.집에 가고 내일 다시 온다
														System.out.println("***************고양이를 다시 볼 수 없었다");
													}
												}

												//// AA111111111212
												else if (caseA == 2) {// 1.고양이 배를 쓰다듬는다
													System.out.println("**************고양이가 화를 내며 다른 곳으로 가버렸다");
												}
											}

											// A11111111122
											else if (caseA == 2) {// 2.이어폰이 고장날 것 같으니 그만 놀아준다
												System.out.println("*************고양이가 이어폰을 물고 도망가버렸다");
											}

										}
									}

									// (A11111112)
									else if (caseA == 2) { // 2.이어폰으로 놀아준다
										System.out.println("*********고양이가 이어폰을 미친듯이 갖고 놀기 시작한다");
										System.out.println("1.고양이의 반응이 좋으니 이어폰으로 계속 놀아준다");
										System.out.println("2.이어폰이 고장날 것 같으니 그만 놀아준다");
										caseA = scan.nextInt();

										// A11111111121
										if (caseA == 1) {// 1.이어폰으로 계속 놀아준다
											System.out.println("*************고양이가 나에게 호감을 보이기 시작했다");
											System.out.println("1.고양이 머리를 쓰다듬는다");
											System.out.println("2.고양이를 배를 쓰다듬는다");
											caseA = scan.nextInt();

											// AA111111111211
											if (caseA == 1) {// 1.고양이머리를 쓰다듬는다
												System.out.println("**************고양이가 내 손에 얼굴을 부빈다");
												System.out.println("1.고양이 간식을 사온다");
												System.out.println("2.시간이 늦었으니 우선 집으로 돌아가고 내일 다시 온다");
												caseA = scan.nextInt();

												// A1111111112111
												if (caseA == 1) {// 1.고양이 간식을 사온다
													System.out.println("***************고양이가 간식을 맛있게 먹는다");
													System.out.println("1.집으로 돌아간다");
													System.out.println("2.고양이 배를 쓰다듬는다");
													caseA = scan.nextInt();

													// A11111111121111
													if (caseA == 1) {// 1.집으로 들어간다
														System.out.println("****************고양이가 집 앞까지 따라왔다");
														System.out.println("1.내일 다시 보면 되니까 우선 집에 들어간다");
														System.out.println("2.고양이와 집 앞에서 더 놀아준다");
														caseA = scan.nextInt();

														// A111111111211111
														if (caseA == 1) {// 1.집으로 들어간다
															System.out.println("*****************고양이를 다시 볼 수 없었다");
														}
														// A111111111211112
														else if (caseA == 2) {// 2.집으로 들어간다
															System.out
																	.println("★★★★★★★★★★고양이의 간택을 받아 집사가 되었다★★★★★★★★★★");
														}
													}

													//// A11111111121112
													else if (caseA == 2) {// 2.고양이 배를 쓰다듬는다
														System.out.println("****************고양이가 화를 내며 다른 곳으로 가버렸다");
													}
												}

												//// A1111111112112
												else if (caseA == 2) {// 2.집에 가고 내일 다시 온다
													System.out.println("***************고양이를 다시 볼 수 없었다");
												}
											}

											//// AA111111111212
											else if (caseA == 2) {// 1.고양이 배를 쓰다듬는다
												System.out.println("**************고양이가 화를 내며 다른 곳으로 가버렸다");
											}
										}

										// A11111111122
										else if (caseA == 2) {// 2.이어폰이 고장날 것 같으니 그만 놀아준다
											System.out.println("*************고양이가 이어폰을 물고 도망가버렸다");
										}
									}

									// (A11111113)
									else if (caseA == 3) { // 3.지갑으로 놀아준다
										System.out.println("*********지갑을 던져주니 고양이가 지갑을 그냥 툭툭 친다");
										System.out.println("1.지갑을 다시 던진다 ");
										System.out.println("2.지갑을 그대로 두고 고양이의 반응을 본다");
										caseA = scan.nextInt();

										// A1111111131
										if (caseA == 1) {// 1.지갑을 다시 던진다
											System.out.println("***********고양이가 다른 곳으로 가버렸다");
										}

										// A1111111132
										else if (caseA == 2) {// 2.지갑 두고 고양이 반응보기
											System.out.println("***********고양이가 다른 곳으로 가버렸다");
										}
									}
								}

								// (A1111112)

								else if (caseA == 2) { // 2.계속 지켜본다
									System.out.println("********고양이가 금방 흥미를 잃고 다른 곳으로 가버렸다");
								}
							}
							
							// (A111112)
							else if (caseA == 2) {// 2.가까이 온 고양이를 쓰다듬는다.
								System.out.println("*******고양이가 도망가버렸다");
							}
						}

						else if (caseA == 2) {// 2.고양이에게 가까이 다가간다
							System.out.println("*****고양이가 도망가버렸다");
						}
					}
				}

				// A122
				else if (caseA == 2) {// 2. 그 자리에서 고양이를 기다린다
					System.out.println("****고양이는 다시 오지 않았다");
				}
			}
		}
	}

}
