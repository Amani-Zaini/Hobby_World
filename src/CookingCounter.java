

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookingCounter")
public class CookingCounter extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html"); 
    	PrintWriter out = response.getWriter();
		String cook =CookieUtilities.getCookieValue(request,"cook","1");
			    int count_2 = 1;
			    try {
			      count_2 = Integer.parseInt(cook);
			    } catch(NumberFormatException nfe) { }
			    
			    LongLivedCookie c = new LongLivedCookie("cook",String.valueOf(count_2+1));
			    response.addCookie(c);
			   
		    		
		    		out.println("<!DOCTYPE html>\r\n" + 
		    				"<html>\r\n" + 
		    				"<head>\r\n"
		    				+ "<title> Cooking course</title>" + 
		    				"	<meta charset=\"ISO-8859-1\">\r\n" + 
		    				"<style>\r\n" + 
		    				"							/*Cooking Courses*/\r\n" + 
		    				"	.ForAll{\r\n" + 
		    				"	background: url(https://static1.s123-cdn-static-a.com/ready_uploads/media/203350/2000_5ceeb164ad2bd.jpg);\r\n" + 
		    				"	background-color: #cccccc;\r\n" + 
		    				"	  height: 50vh;\r\n" + 
		    				"	  background-position: center;\r\n" + 
		    				"	  background-repeat: no-repeat;\r\n" + 
		    				"	  background-size: cover;\r\n" + 
		    				"	  position: relative;\r\n"
		    				+ " margin-top:1.5%;\r\n" + 
		    				"		  padding:2%;" + 
		    				"\r\n" + 
		    				"		}\r\n" + 
		    				"			\r\n" + 
		    				"	.menue{\r\n" + 
		    				"	float: left;\r\n" + 
		    				"	margin-top: 15px;\r\n" + 
		    				"	padding-right: 10px;\r\n" + 
		    				"	margin-left: 2%;\r\n" + 
		    				"	\r\n" + 
		    				"}\r\n" + 
		    				".menue li {\r\n" + 
		    				"	display: inline-block;\r\n" + 
		    				"}\r\n" + 
		    				".menue li a{          /*Move the menue to the top and change its size*/\r\n" + 
		    				"	color: black;\r\n" + 
		    				"	text-decoration: none;\r\n" + 
		    				"	padding: 5px 10px;\r\n" + 
		    				"	font-size: 20px;\r\n" + 
		    				"\r\n" + 
		    				"}\r\n" + 
		    				"\r\n" + 
		    				".menue li :hover{      \r\n" + 
		    				"	background: black;\r\n" + 
		    				"	color: white;\r\n" + 
		    				"	\r\n" + 
		    				"}\r\n" + 
		    				"\r\n" + 
		    				
		    				 
		    				
		    				 
		    				"  	.text-title{\r\n" + 
		    				"	  		 text-align: center;\r\n" + 
		    				"	  		 font-size:x-large;	\r\n" + 
		    				"	  		 color: #FF6347;\r\n" + 
		    				"	  		 text-decoration: underline;\r\n" + 
		    				"	  		 79.0text-decoration-color: red;\r\n" + 
		    				"  		 	\r\n" + 
		    				"  			}\r\n" + 
		    				"  		\r\n" + 
		    				"  		\r\n" + 
		    				"  		.button {\r\n" + 
		    				"			  background-color: orange;\r\n" + 
		    				"			  border: none;\r\n" + 
		    				"			  color: white;\r\n" + 
		    				"			  padding: 16px 32px;\r\n" + 
		    				"			  text-align: center;\r\n" + 
		    				"			  font-size: 16px;\r\n" + 
		    				"			  margin: 4px 2px;\r\n" + 
		    				"			  opacity: 0.6;\r\n" + 
		    				"			  transition: 0.3s;\r\n" + 
		    				"			  display: inline-block;\r\n" + 
		    				"			  text-decoration: none;\r\n" + 
		    				"			  cursor: pointer;\r\n" + 
		    				"			}\r\n" + 
		    				"			\r\n" + 
		    				"			.button:hover {opacity: 1}\r\n" + 
		    				"\r\n" + 
		    				" 		  \r\n" + 
		    				" .lazania-image{\r\n" + 
		    				"  		  border: 2px solid LightGray;\r\n" + 
		    				" 		  box-sizing: content-box;  \r\n" + 
		    				"	  width: 700px;\r\n" + 
		    				"	  height: 8px;\r\n" + 
		    				"	  padding: 150px; \r\n" + 
		    				" 		  margin: auto;\r\n" + 
		    				"	  background: url(https://cdn11.bigcommerce.com/s-t9imb/images/stencil/1280x1280/products/1653/17523/lasagna-bolognese__25251.1512873472.jpg?c=2);\r\n" + 
		    				"	  background-repeat: no-repeat;\r\n" + 
		    				"	  background-size: 350px 350px; \r\n" + 
		    				" }\r\n" + 
		    				" \r\n" + 
		    				" .text-lazania{\r\n" + 
		    				" 		  line-height: 0.7;\r\n" + 
		    				"         letter-spacing: normal;\r\n" + 
		    				"	  margin-left: 60%;\r\n" + 
		    				"	  padding-center: 150px; \r\n" + 
		    				"	  text-align: left;\r\n" + 
		    				"	  font-size:25px;\r\n" + 
		    				"	  top: 10%;\r\n" + 
		    				"	  left: 600%;\r\n" + 
		    				"	  transform: translate(-50%, -50%);\r\n" + 
		    				"	  color: black;\r\n" + 
		    				"}					  \r\n" + 
		    				"\r\n" + 
		    				"  .steak-image{\r\n" + 
		    				"  		  border: 2px solid LightGray;\r\n" + 
		    				" 		  box-sizing: content-box;  \r\n" + 
		    				"	  width: 700px;\r\n" + 
		    				"	  height: 8px;\r\n" + 
		    				"	  padding: 150px; \r\n" + 
		    				" 		  margin: auto;\r\n" + 
		    				"	  background: url(data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAoGBxQUExYTFBQYGBYZGh0cGxoZGxwiIhwaHBwZGRogICEdICsiIiEoHx8cJDcjKCwuMTExGSE3PDcwOyswMS4BCwsLDw4PHRERHTIpIigwMjIxNjAwMDkyMDAwMDAwMDAwMDAwMjAyMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMP/AABEIALcBEwMBIgACEQEDEQH/xAAcAAACAgMBAQAAAAAAAAAAAAAFBgMEAAIHAQj/xABEEAABAwIEAwUECQIFAwMFAAABAgMRACEEBRIxBkFREyJhcYEykaGxBxQjQlJiwdHwcuEVM4KS8VOiwiSy0hY0Q0Rz/8QAGQEAAwEBAQAAAAAAAAAAAAAAAQIDBAAF/8QALBEAAgICAgAEBgIDAQEAAAAAAAECEQMhEjEEQVFxEyIyYYHwkaEUseHRwf/aAAwDAQACEQMRAD8AUkqX/wBQVXdWrmZrdtid5NWmsCDyNebcUeik2U28QByFbIxBmw+FEmcpUdgPdV7D5EvmDQco+gyiwSlCyJ01jTTnhTSzw4reQKI4fI2wLqk0L+wdCth2FedWG8Gr8NNbWCaTymtGsa2XNACVRuB93bfnQcqFlkjF0/MXv8GWo7CrLPD/AFFMxeSOXuqBzFjpRaYyl9ga1w8neAKttZUhG5FTFwxyqF0eNdxZ3IkIbB3rFOp5VRU6kHvEViszbiEpmmULOcqL5xBiwqlj8epCFLnYfHlVR3MzyAHmaDZvj1FsqJlO6QOZ5HyrnFIFkmXcWKYICZJ3V5neih+kRUXZ1cqQ8JqPegWPPnNE2mikAhUH+cqSTa7YsUmuhgXxYwo9/DaSelq2azXDrEhK/IEfrSpjCVWUuee1VSzGxv51yTfmPdeQ8M5hgSYUtwHmP4KLYDCZa7/+Rf8AqURXMUIWYHOpE4hXskmTawtVYtx9P4Jupadj39IWR4VjDtuMkpKlaZ1E20k8z4UD+ictrc1aR2gFzzgH9al4lccLOGbUbBtSoPWNI+BNc8yzHrYcC21FCgd0/tzFXhLmrIZIuOj6Z7YAXr1KJuduQ/WuZ8P/AEjhQSnEJgc3UglP+obp9bV0HLc6aeQFNLStJ/CQa7t7E9iVaCbCtyyIg1qp8ztWjzxjxpGlHY1tmuIVaKHYrLkq7w3HKiDw28N6F5m8qfs9xakm15jRvyI8Jl5CitUdIFW0M71HhdSk3MKPSrrGH0iJJPU10F6BkyviG4G00EefvBt6UwvJtQXMsKlV1HbpTyFQFewKCSetZUisMjw/3V5SUMQ/4ewkbEmrTSEAd1sVWGKmwIHkK8cfPMn0qbjRdMvh2Pwipw/beaAuYlIvqv414jHReJpUNQbcxR2rEPnnagyceraAK9XiJ3NqIVFhN3MCLpV3uXSqDegEvpCg4pIQoE9OfuqmMW3Okd49Eyo+4SaM5VgFrmWykEG6onwtv76llw5JK4fkhljG7s8GYgfiPlUJzaSQEEeJ5+6ibORyvQpSh1hMD3mrGbZfh8KypxShqA7qTJKlH2QBN5PQVvh4eekCWeCAa8YqJJI+FRFxRiAsz+VR+Qpxy/LgthBWEtOqSCQI7qjy8akS862CHMMFwLKaIv6Kgg+F6qvD+rJvxS8kIbmDxCj3WVqHjpH/ALiKkXkWNUO4ylP9S/8A40/5bjcOQpaF+z7QVMp53B2rzD5m7iFKGHCUtiIeUD3p30ptPnten+AvuJ/ky+xz1nhjGWUVtAAzuSLbg92mTF8HsPJBU2ptRA1dkVRPgIj4U0YbBBtPZaVLCpKlki5V7X8FQrwGIaSexfCki4Q6JsPu6xeI5kGm+FDoSWab7EDE/RwQfs3/AEWm59R+1UcTwhi0kd0KA/AofJUV0zD5ihTKcStKEmCfaHiPaMUBHEKFpV9axjTYKjDbPeIRyCnADfyilnhx75aGhmyL6diG7kWJEamHD4pTP/tmq3+GPJlXZOT+Hs1SZ9Kfsy4tw4ZCcGhThQUgBaVBBA3BUe9bfa9Bsw4rxvYlKENB2ZC4Ps9NM6Znn8Kyyx4k9SZojLK1fEXG8pxBAIZeBj8J/WrLfDLqdK1IdmQVTpsPC9MnDedYhQAxgb0mPtE90gGZkC0bXEWmr+e8ONvq7Np9ySDPZLCo8wqfnTxwQl9LJyySg/mQq8TZ828+2htCkpab0kqi5JFhB6Cud5mjQ6sDaZHkb09PcBvp1Fh1LoSohQIKDqG4vIJ9aV+JcrebAU6ypBFpIsfUW+NNGEoS2tAlNTj3sHYHFqQZTIPUGDRjC8QqQrUpoE/jbJbX6lFletLgVU7ThUQkAknYDmarRKx8wf0iuJ9l9R/I+3J9Ft/qKdOHM7ffSVvNIbmNMLmR1ggRSjwbwelADz91xISdk/uablHTttUMleQ8b8ws69IgifWo28RFyn4UCde8PdVR7FK6qHqaiyiD2XK3KhpJUTzsJtRb60mANVc9ezFzktQ9aqOZq9/1V/D9qCfFDNWdCxeKV90W8aA5/i0FtSVuJRPOaVF4x1c6nFn/AFGheLRzPxpOTY1UTzhhbt3j46jevKX3cWJNZVvhv7k+aGxOehNgQB1NRr4iSQR3lf0j9qqtYJKdm0eZuaJYTAkWAF+XX0FBuJZKQMGPcJlDJ81f3qyHMS5FkJPS5+VH8LkUH7VwJ/II1e42T60x4HKCgBTSABzH3lDprO3oAKrDE3tql9yc8yjq79hUy7hXEOf5jikTyAg+4d73xTJl3ALQu4FL/wD6KJ/7Qfmas47NEpbKFYZ1sT1CdR/qSozW3/1C2lKGg26NfdSpc6NXIFd96pBY+XBbaM880n7GZEGi+/hUoSA0EypAhJ1coGxFFXGcSgQx2S0cg5II8JTM+6gWQ5a3hmi1iVkKccK5Tq0qkyE6hcjwNHGM1wjQ7riEidutWyThF1ZFW+ynm2d4nDNyvDJchMnSvpuBIvHvobmDOrGMYvFKCGUp+xSlJPfUJOs77eEVLnWZB3ENEun6qmStO2pf3YgSR5mhWOzNKlzqJSFHR4JOwF7GpRzxjqLTfvtIrjxPJKhkxfEuASoKU4nVIGrSbXgTawr3H8bYdIAaUHVEgWnSATElUQAK51mWWh9UpK9IBJuNIKjquefOwqLLMkXrSlkkiDqn2bRH851N5mbH4Jo6pgUBJW44ttanSJgwkJAgAbz5netxlyUT2D7jSfwjvJHkFAx6Vz9DjuGUAdQTN0j2Tz7v7UWzTilt/CONtkhXdGlR0qMKSVJg7yOXMUY+Ke+X9GafhnFpBzFcWfV9SHXG3HB7CUBQUoxIncDY0qZ1xDisSQpMtsn2hJCY6zufQeFCHss1PNrcI0yJTaBfb5HflV/iPGpaWlsWm+kbAcjNSfiXN3HRqxeFitPZDhsP2jv2q1LPdA1GwG0AbVLm+EaDnQAQYHwHurVrUVBabRufGZqPGMFZurV3p9DJPzqfbtnowwKJK3iG2+1TBAFwPkfdVNeZIDRVBJlURsYgAyYteatvYTUnUoCPH4VRxOGC9KBECBHKw/nvo0iyhFIrfXFYgtBRhsbJBMKgwCeotz6088OZ+jDFLUjsSrSAB7JPMQJid560GwmT6U2AFxPzgVXzVtSGlRYFJA0jpYnr60yfHaM2XBCcaHXFqOGxGtMhh2S6Y1BLkAJP5Z5na1XmMsCwrWoKSdu6B7xsR6Uu5I88+E9q+qAASgNhIPMSq8jyrfJcQcU46l5x1p5pak6G1FI7OZQY5yOdehy5L/Z4FUyvn/0YYZ2VIRoV+JuEn1Se6fhSzg+EF4QlbSQ91Un2wOfcP/jNP6ckZSoAJdUCe99s5ueZGq4qTi7BlvCLVh2xqQAQEi4SCNWmOcTXcYypepyk1sRsNniTYGCLEGxHmDVr/Ez1o1mPD2GxrCXwQuUg9okgOJt+LZUdFUg5zkmKwoLjau2YH30jvJ/rTuPMW8qzzwyRWORMYV5h4Cqr2OHSlNriAmphm01BxaKJoMvYsdKprxXhQ5ePmq7mMi9I4tjphYYuxoHmeP1HSDVfE5hNgagbUeSffT48VbYssl6RHWVL2iuqaytBOjo+Fy4FJWruNg+2rr0SkXUrwFMmUZZbugtJ5kx2iv0bHgL+IoSjFBA14lDvaEEJU22pSG0kWDYSDp9RJrTIsxZaUUMs4pyRK3VJUCVC19cfD3U0cCgr7fqCeaUvYJccMoGEWw2gFax3QImxEmT033mjWW4RwYZtsOaVhCRrgG4AnelPiTMF6Euc5tew5UOyTip9k6F4gEm32qVKAiAmAgSD5VFeJt8X6kdXY55+8EtBp0nVYhZ2PUmB+lKrb4WpOHUspacVudpT3gY9N6zGY37X/wBQ8pxVgUBMJCT3jEzFiIm9vSqPE7SEjXq1oiU25HaYtevMnN/5Cl/FaH7Q6v8A1YjWVrd07rUshIjyt6AGgmeY9Skw22SFezrJv4pSTYeJpUy/ixZcEtdpA7ifwkbEDaiacVi1rLqyjYgIidMx0O9q1ZeTi1FJP+37hjGyXNM0Lbg+yDjqxCAo91JgST18KZOHcA2GtWIbbCgmFHTYgkzyjY0lYPAPYpSSVpIQveB5W2tc+6m/CYd5vU2t5C07pCk96PQ8rcjS4YcIpPs34YRrYEynhsOuPOBBaSVjsUoUdOlJgqjbvb3FMeGwDuGTDQDg5hVifIi3oRXjzyAQVvpR+UqCT52itXcbiEEBtxp5B+6s94DoCN/dVG7NF8dRZXxvEWH1FGIbU2fzju7Tvt60tY/F4J3vNkaokJI0rSQYJGre14mYvWvHeduuJS32IaC7rUqTewEbRIHT3UrMMpQZKpECd7Sb+kftTKCq7IzyO6oO4rMVFACgSLQ4Lzz85ioxmDDjgWXAHIAOoqSkxbdQ+FB2XnVEhBgQRpGxmBtFaspSXQl8FO4Nrg8pHwoLEk3f9A+JLTQ64POmAkS6iEjkofKatMZwyq4UnbeR15UqYfKsNeHFyVCwSiQN5uY3oPimS2pWxJvJCZgn+bVyUZOkyjzTW2PuJ4iZSCNSdwDewnbat28YwtOrUFAkWBAkzAFzYE8hy3rn+IbUE6ibHY2vXjUKTKlSOhpuGrsZeJmnR1w5glQClKSgC3IX2gcztyoRm3ELaRoaIUtZCQSO6kfi/Md7Ca54lLZMT05/2qw1iyj/ACSokb2Sf0mu4iyzzrR1XL8MN21FB85B8wd/OtBgnmHXMSgFTi0gFMgIXHM2lJj0pDyninGJgpOpI31JT+gBj1pkyX6Snu0SlxptbZN9MpUBfYKVBO3p51fHk46Z588be0OWGz9+En6i8Ez3yC2YEbiFSq8UQbzxLncQ09JsdTSkhI5klQApUx/0hYZCfs2XSVC6CUab+IUSk+Q9Kgyr6WEphL2HUlsnuqDiVECfvBQTYeBNW+JjfXZL4c0MfDTKcM0nBvutdqrUsCYKklRM33Mm9EP8HZEhKtKlSQQRPjA5jw2pR4QdwmZdv9YSh5YcUUlQOpLZPcA5pHgKtY3IsA08hssvNEkBDyHF2UrZM6iQD4iJq723v+Oia0kA+M/o+StRW0EtPHYCzbp/8Fn3GuZYsLZWptxCkLSYKSLiu+ucOlCVFzGPLQEmzpRpFt1HSCY8TSxxHkjOLQNWrTH2WJiw6JUfvIPJX/NSljTVrY8ZtaZyI4xXStFLJ3miGb5I7h3FNOp0qT5mRyIPQ1rg8scXdLZUOaibD9KhcUV4tlNoch8Kl7Hqr9aJM5Um4W4J5BAn42FW8K0lIjQlMczdR9Nh7qnLIvIdQ9QJ2Q/N7q8pgS74L+FZS/EDwOk4jP8ADtaQtzvKiEJBUoz+VIJ+Fb57g3XWx2J5EwTEk7Db5kUmZlisM5h04xDakuLOiQsgpWBtAPe2/m1BsPneIT7GIdbHIayYHgDM9OVUyNL5WZbLmftKUR2pIIAGkiLjce/lQhrLXSrQhRg3UAqJjx8uvpNTsY4uqCnCVBU3UbyBPlRpOJb+zSkSTYJ+7dUctokVlVx0KBv8OcDxZShRBSLhUpSCJnUtKQOe/jW+LdKk6ErStKTB5yRzPLyopn2XYpTUJdGlA9hMAKPPxPmTypKRilNkgWOxFNxU9rsYLY7DpREEdpFkp51LkDbwcI1aCsae9J3PL96EYPEqCivSVEQAehJgT57UzZXmQSO0KNoFj08IpmnBUacEIy7YzZRlbjI0ApBgXUT58hRZzGupNsNJi2kiLHwE9OQoDlGfqcuXmkwTZQM9RYqB2j40Uc4hWwQpXYOpsCEL0rGwkAzMUps15GYnixop0YlmxiQEqt/uG/kar/4VgsWT2L1gEEDWQQZUDZRkR+1SZznSXkJKe4JG4SozZIkKsJ2iCbjagWYYZDPeGgKVaCkC8b9OXIUjlX3GS/BR4tyN9ppS+0U4yIBCjdBnu3nytS1g8IorAUJMWTJvF6P5rnLbrSklZSoJSk6b64jcWmaDIxzgVpDYCpA5zIB2vaRHLl5zeHJxZnnx5W2EWsKTISIIJFwUkCOY1elRY3DtghMlR9nWmblKUpvvewPv61XTmrrKyFCSq99zq2Mn+WonlbxACYSB3iIvGr2rbeFo3FTknDbKRlGWkaZblXaJX2adKdVioyo2JMGBEQBccxVFeTmyk6iSdtJJkX6X9JplGEW21NiB3lwIiRAJi1xymffQHNMQ64pKQChBuEg7xsTe3LuzypYTlKfoh5xSj1ZFiEKIha5HIEAQfGNoFU8EAlUEFQ8D7jV/AZWAAXBrEE91UbcpvHurTEYdtCidcCZSBCo8xaqKS3Em4v6iB7SASls+fPx2NWMvIS0dGoq90z6fM1M72YTMykgSYvI32JMTVJjGjWkIneIIsR5/2oXyi1R1cZbZu8lTZPcTJhVxe/XqK0e1JAJ3XJREcjBt59aI4/FEoHaNmRBCgRfzEyLztNUlsaCHZSto21JJOkwDCgYKSZO4vemi2110LNJeZXwDp1iVGx2MVYzjDBJKkyUETMC14g+pHvqpmgClFxJ53A+6fL9ajfxK3ITAJ8B8aZRbkpL8i8kouLMwrWpYKZHMHnOxgjxrtXAXEiX8OhCv81A0qm5OmwUf6vHeDXIMMxpRKPavuOYO1qcMkaQ88hLJcYdDSSh1JBDiQADqTsYPW9Wh8zfoZp0kkOf0oOKOXPaTHsk3iUhQke7lVnJ8xQMvaWtpwjskgt6DqIAAMJMT18qCcQZQt5jssbi220AhQUhGkqKZtClmfICmbh3EMvYdtbbgcSEgaj4CJI5H0rTdQS72R8xTzPAs4lpASQpC5+ruqTJQvm0sH1iekchSFiGFoWWnSQpBgg7DxCRv5wBXb8XlzbrRbgaFC2mBB3BEc5vNc+4xyZT7alwPrLHdct/mN7pVHiL+cis+WCkrRXHNr5WKn1pMc5HQR8v1NesPEiNPkN/gLfOqCITBUf8AcY9wFerxoIhIKh1UdKfcLn1rJx9DTyLvaqHNA/1isoX2n5kj+lEj0tWU3AHIaE4LDAJLba0pko7NcyHIglQJI1XtNCsXw08FWEpNgdpv8P54U6cQpbKwkwPZWbi5SoKT48qq4nGJKDDkKm2mPjNLkm1JuzGLmL4cX2AUkAwsd0SIACiTO82v51Lw72QWEqu62VJubavZJ+FF8qzTUjukayufBVhJjpAvQ/P+GFJcOIw5lBgrSJJbUb36pPUdKXmmqf6/Q6hiccDiVQYt7jXOf8NlxaljuXO8ySTzEc+XjTSthssGXVFU6juLxAAi4H9+tC0GxB25+6pLI49HEWGSEyEAAEybevz26UQw+E7VJaEArgFUbJ8OcxNV0NgD8xgx0FeKUo+ySCAYif03pVJ8rHxyqQxjKMO0klUBAgHuyd7ezeiuXBvQC3hRqkd5SAnkNiq+/hS1leEQppDq3Vd8AhKiSZnkBJ5Uz4bGOKEIbMg+06SB7vaMem9X86PTfqe5opxRKfqzX3TbTJIuk+Ujxuml/McKp4p7Rvs1I7swCIkSTfeef6UezUrupb4Qo2+zSBayhcmfK/WgOZ4zSnT33Ad4kkDmJ28/Papze6GilQsZngUTKCkmSLEAzAJm3SKtYXHsBkpLR1JN40FQAvIEjSBaZ/Sq2cONEwgBOk7Dfnz5x18aHNYxCljWkKAgd61gb+EkWvWnFtbMuT5XoYsNmLbxSyEFwOCCVBvVI0hABRcbeJqu7g1tOAACAfWLGOpEH18at4R8IVKXVlsAFKLA96247oSAep+Yqo/jFuuFQHdTIWqbqsYJk2AMeJ60uS5ddIrjSS+7COJx5UnRo7sgwdt5A67zuaAZkoagSmw3KT6geXh51bwWLR2oSUEBZsla1QmCZ3M8+ZO1WM8xbTstNoQCLST7I539POpwhwlRWXzQ7A2DxqydAMdI6elR5hgFjvHzIJv41HgMPrWE2lXLpBnn0iieIwqglUeh1A8p5VSTUZaIRTlH5ipg219mRAIiRBBgfzlXicOELDk2AnTN4+FT8OhZdggx06gb1Y4hy9QKVEaUkwTGw/t+tByqfH1DGKceXoFsoaU4iUpTpiDqB/TbzFC8yaKHSGlw4CZCZEp6GbR8+nOreXZ00gJbCj08ufu5xVXiF8hxRtqCgQZvoKf390VHGpRn0Vk4uAKedSoLjShf4SNxIBA8Rc+UibCtsA0QoFW5AM2sB/f5VXwyA6snmAbQI8PjRXHAJCUwCqYT/P5tW2WkY07bYS4Vy8LeJ3CTf+o3/nnT1w7hww6to2Sodonw/GPfB9aGcG5cEISIvuT1UdzRziPK0uNpSoqAUdCikwdLg0mCfSnwq3T8yOR+YvfR/ilP5jiXnEqdAKkIcA1IQAowArYSmNt/WmzOMmy9oF15pCAowogKAJUYuEW3O5HOgP0e4xnCJdwjyyytDilAOFIlJiCFQAdqccRgmcQgau+gwRcwYIUPSQDWqbcZbtL7ehBbWgPhOHMRh+7hcVDPJp5GsJHRJCgoDwmqeZocYcTiHl6iVdm5CYT2S4CSBc91Ue0Se8rlRbjXPvqeGU8lOpVkoHLUqwJ8BQHK+Di6yt7GLU7iHUH2jZuRICQLAi1xRTtcpdPXW2c15I57xnlAw2JWJAQo6keR3jyPzFAi5q9lJV+ZVgP0p/4ww4fwTGIUAVt91fmk6FfETSthEpO5iOZ/Qc6w5X8NtGvGuSsFfU3D9/4GvaKdon8Z+H7VlR+LL0/op8OP6yzmeJaaKkIPaK+AJtcjpVHBOqQoKWSpKTJTO5PL1+AJog7ww+klWtBHKNX7fGqWWNqcCgBMLIPu5mi4tRuvcwk3DaylwRM7X5DeB5/pTJgswWhztUncTB2UgmFJI5iaGYPDaTa+mVCPGE2671LigpKyRZLSQIuZVIK/gTWWcuTCFM7w7TjZfw41J1aVJgyhYuQbeyRcKPI0roxMzz8B4USw2aLaYxMEpBQlIUkwSoqGmP8ATr+NL+CxyU9xQ2FjG9dHG2m6CFm1czed7VvhmyAVCBHPcifO1RHHt6UxKj+Hp7/dVxjL+1CVKhY3SLhJiY1R96DEiKMYtO2Xwwk5WkXcuxzDaZ1Bx1R2ABKr8z92On71ZwrjmJVpUdASQIQoibXMg3MXjx8a0S0whCZAb1dIkEEHz/5qVvGK0w0nSJMrsNUncdAedvdVLNyVdmueYtplKQhOpZMHUTYbgkgeXdG83qs/iFud5zvrA1aQISmxgR/DeqTWUKWvvkqQqYMydQ2B3CZJ+fSKPuq7NtOlskqnf8O0ne4AjzpJRseJHhMC0YUWwpOgd2wBUdRJnmPZN+gpN4jwKHHCpltSVaoKRJk/vMj0o9iM4W2YUJIsOgPQkRVrIMUW1KUqPtDeRvqIge+3uroTlFgnCMlQkZfiigwqUxMjYz86JYfNHVdxlqbjlN7RMWEddqMcW8GFKEvInVMuKF+4oRME8iDz2V4VQy3JHEIIlQ1e0qQABB0nfeeRrS3Bq2Z4Rmm4roCrxJ72kKVBIsSmAIuQJAkzsaI4fLyGu1BSLEn+m4577bV7nmEAQlQUlJgm1pCdMbbn0qg7jlOAgkkC0JAuI8LfDejJcknE6MuEmnsmy1hLjkpWkGbJgg+Nz+9M2LwZ+r9mswJ7xBAjpv6e7xpGRKFkkaSJhN45jcGbcqP4DOHFtbyQYVbcevOpZsck1JPQ+HIpJxa2AmcQWXCAVCDHdURNGcXnTbyEJJUkixnYwBHr40P4hQjUlaIuLiNr1DljTbkhUgxa/PrHOquMZRU2SUpQk4IrvPd8lMgeMcvSpnMWFJ78qVtfp51rmuX9kqNWodYqHBYVTqwhPPn0qiUWkyTlNSaCuRNaUqd5C3nIvfw+dXMoQXntZ9lNh59ar9nIDKBF7xyHP+eNMeR4IJgCk7dnPSodOHmISKJ57CWJ6KQf+4VHkjEJFT56AQ03+NxM+Se8flV8S+ZEJvRjmHw+Pw5lIUlQKdRTCkna0iQQaG5YnH4WMOW04hsAhC9YQpKRsFBW4G1qp4viNbqVYbKWpKbF0BKW0bzpkgFU+Ec70VyjhZptPaPKW68R3nHFmQTuBeEjyrT9Kal15J9ku3a/kF8P8Pdu687j1NvuhcBvVrbbTEgBJETyuOXrRDO89GGcYYaaC9agnSkwUp6hIFwOewFqFY/hPEYZx7E4B6CvvKZWnUFnexJ8yJ671b4W4sZfbCXVJbxKRDiFwkyNyJi3hyrpb+btenp+ArWugW5h9TWOY5B1RHgFpCvnNcuRomVDlurr4DnXV8E+HHccUqCk6kAEXB7nWuW49CQoxZWo7Akm5rLn+v8Ag0YvpLTOIRAsv/ckfCLVlVNK/wAA94/asrLwX6zTy/aGBRfy11IUou4dZgA7jwHQx0saPYfF4TEIcRhigOkExp0lRG24BNFWcQFmey9k21dfCxqjmnDDOIWHSns1pIlSCQT5xzHXetEs2Oqn/Rgr0B+DaeMPIaKhbYbFJIIN9wbxUOYNqhesaNZNz1JFgkSSY5Ab1EM0cRiVYdAUE6rISfaJi/rvVXiDPXdam0jskoMR94xzKvPpWKWJN3FNLys5dbBmdYkgdiAQlskQdyr2VFUWnlA2qnli7KBTJMX5x0qLGOzbp8ZvVdvFKEhG5tP8+dXhD5aKYnUrYebbbBG3MGelr0QGaQC3hxG5JOxO+0+V6CM5QFAEqJV97wqRGFUFQm5HP5H+1I0vU3KUvJUE2cMklIUdSjdRJ9T/AMUy4ZKdJRr7pAtOxTJTH85+FJP2oUQlYMhJEjn6RFXsveVIS4o+1uLDcH/ilqiuOSvoMv8AEIw5ISkHnFxBHPp61JlL2JVqW5A2gEbTMCOnr1rTEYFKgnud4Rc3Cum/O9G8E2G0G+re3leh2W4SkCsBgBKxiE95UyYkOTc35H/mhuNwLiHdCO8i3dIkBQIIVfoeXjTNmroKQAdxaOdj8KAZg4o6NBJggnmYHL3ah40KNEcMaGXEZkOxLalQSkxP3huf+R0pNS644lSJhQUCU/ePOx5JNj60y4INuuayY0EAj8VpAFLHFhh1ONQCElWlSR+EDTPnuPOnUb67M+ase0teYIxKA2ftJKyTtee7GyuYN55e6j2SIa7MmR2itgNxYkEmI5TY1ZTh2H0IM6tYPej2SbRcWUPmauOZChKVFv8AzQAIHdkW2vefHxpXluPFrZGEI8ua6EfO8JCu1LiBJI0jVIgTcRsTaaiwOYON6vwzced/OpswZdSCpbQAMXULxNiI2NVstZDijqBt067D41opcKkZpNrLcdWQ5liELOpIgncCqraykg0SxmVEJ1puOZqpl+HC1X5QfjTxceOuiM4z577LuHbceHegI6n9KuBCWQQgXNgeZNqjxGM0DSI9OVjU2R4MrPaK25fvU+/YpKVe5dyjA6U6lXUdzTXw9gytQtahOCYLiglItXQciywISLVSKIthLAsQKDZ2+6S86wNSmUFKLT31QVGOcJ5UVzTF9mkJRdxfdQPHr5DequWOLSpLKGiUCe0dWCmV/lBHek89q041xXIjJ3oocC5w26yElycRJLw0gHVJEkJTAEWB8KL5tlnbNrbLhGpJTskxNiYjePnS3hMoxODxbzzSA6y8ZUkKAUmSVDe1iT5zXr/HinXfq+EwynXRZeo6UoOxkxy9B0mnnFuXKHXfsLF/LTDmIxuHwTCQ66EIQkJBUbmByG5PlSyrNmMW6l1rAreSgmXFNtpHgQXCCY6eNR4XhUh5eLzJSXIukaipKOcadImOQAijmdZw23hFvtFJTo7mnYk91IHrXJJPW2/Py2H3AORP6msU+UlOt1UAxskADa3urnLaRqKkgqJJPQXM78xXQcx/9Nl6UHfRJ66lXPxNIGEClKkylIsL3HkNp99YvEyuTa6NOBVFEupP4E+6sqx2Sep99eVh5I1bG3C8RsoQFFybbQJ84HOh2YcWrPb9iJQlsQTyOogqjn7Q91Luaupad7LSVGLRzJBCbefKr+GyTEhJKC2NYEhV5G8G3WtKwb2edYMwiySXVLlau6CrcTpAWFHbTf4eNUFulRIBKrkzzMA367SaYEtOsNaH8MlxqSSpBkifO/y2qk6rBqWXAXUggRCLIIi4Pp86vwdIBaxOQl1CcQwQNY1FuR3Vc9J/DMkDkDQheFKXNUWChIg2nfyA2po4dztkw0tabWSsCAocpH3VeFEuIOGtaO0aHf8AA7jnU5Kcey2NxYo4pxUFaVADoenn51cyjFkNlYFlEoM9YPpvHPn4VK/gmVoDLncdjuf1/mEbHr4VtmmGCMOEhKYAA8e7zqLSpI2Ru7KT6tKgdMKHx5H1/ar+DxKJhUSYIP5htQd9B0t+IsfhURbUB8q5xRrXy7ocWceCojdN7dOcDyPyq2nFqHIk3SY67xfwvSbkjqkqSndKiRPSm7ArCoBJkGZnoAB+/p50staNWOalGyZodmjTN0Gb87aRPOI58jVVlssvh3dC0qCgfukiQffsfGp3gHDZQSrkZ3nr4fKocXjUnlAggdDbbre1cmFzV7N1lIIiwkX6EXH88KDcTPpU24lA9q5Ty31KI5A6kz4zUWe4ohOpKugKeoPMdIt/Jph4R4TOI0vviEWhP4o2J+emmgndoxeLyroq8NZOtGF7XQok6bJEkgnaIvRF8rB0uJUhQ6iDHryroGFZSgaAAANqhzPLm3khLgkAzvF/Sqzwqe72YMfiHDTWjm2b4RLqA3oUbe0BdN7TG4NJuZ5e5hikyCCT3gNv5aurZllJZhSDKQbeHh/eqGKDTiDrRM/E1OLcJcWi8uORcovZzU45SmksBIJmdQvZV9/08axDHYhRmbb9asdkG3XUhQHeMaRYDe0/KoHliYJ1QbeMbVRu3S6Iy0rl2eYDLlOELWYTvHX9qYsG2XCG2xbwrTI8ifxBEgpRXRsg4eQykQL9aemyDZpw3kYbSCRejuLxaGEaleg5k8gKjxWMS1CQCpZ9lCdz+w8aTeIM3xAxbWHbKO3XHeUJS0lXJI5mBJJ8K048TZGc6J2+NWe0WpCHMRiIOlLSSUpA+6FfMgGtsswWPxw7XEYheHaJs01KVQDzPtD19wpqyrKG2QSlKdavbWEpBWepCQB7qsvagO7HrTvLFfSvywKL8xV4gYfwGHW9h3luaQNSHiXNyAVBXtAjeJiBsKl4HzdGIYS444hT6p1gaQQQTA0joOdWsKjEuPLU5KGdOkNq0kqPNRjbymkrg5wZfjnsO/CQ57CzYGCSm/iD7xTVyg15rZ1016D3nOVl1JSlwtyCCfaOk76ZNietK2KwaFPMYFqexY+0c8SPZB8yZ9aYeI8+QwzrSQpSu62kGdSjYbcqCYBj6th1LcMuuStxR6m8eQpIzcIW/wAe/qc4qUqQB+kXNbpbBG8nyH9/lSiHyR3RPiR8hW+bPF51bqrg+yCYATyknxvAqsDM7R1VISPIbk+furDJKTs2RtaJfrJ/Gfef0FZVc4r8yvf+1ZQ4fYPIv5KA9iyXidYJIA2lNo9KfWRFL/BnD6m5edEKVsDyH700dlWjI1dIyRPEtahBvXuHYbQA2lIsICQNh+lBs/xuJaUOzbKmjuUDvT+1MWULSW0kJ0yLiCDPPe9BxpWG90KnHmQoDP1lACFoI1aYGoEge8VvwTiMSWQ6Fl1AJSW1ETA2KT18DTTnGUN4hsocEjl4Hr50kcDpcw+PXhvaSZCulrpV4Wt61SL5QaA9Mb0N4fE90pAWN0LEKHofmKEcSZKvR2QEiSpKjM8pST6TemTiHL1OMnskILounVy8iLg0OyX604koW2q26XoIP9Kxf3g1N4VKNp0VhlcJUxHzFghAUBbY39lQ5nwPI0PU8oi0WmY6W+VdNeyvDf8A7GGLfiRqT708vOKs4XhPAOAKbCD/AEEH31F45JdF/wDIvzOV4LGpSsEkD1sZtNG0ZqI3gbyDubkehroTnB2GJjsGtEfhEzVLE/RrhFbI0+VB40wx8RKIgO5mGx7XevN/hXiMU/iAEIa9TMf3p3R9GjSDKI/1Cf1otgshcaslKPQVyxpAlnkxWyLgFa1JW+sBPNCRuOQJJmK6ThWUtp0jlVFtp4chU6W3KoopEZTcu2WAqd62U6OtV04ddSJwZ5mjFUK9kWIUCKU+IMrcgnDpJn7o5eIp2Tg0871ssIQJJCR1NqLipdnQm4O0cVwPB2OdUR2RbBJlSom/QfrTZw99HKGoU53lCmbGcV4ZE6VF0j/piR6q9keppN4l+kTFB3sWGIJAMghaiD00gpB/3VSPh5P7Alksd1pYwyJWpKE+JiT0HU+AqJrFPPSWkFtuPbWO8r+lBuPNUeVJLXETjGha8ueXiVGAt5RUL/hOm09ABRxjO84XcYNpI6LWf3qvw+Pp+WT5WFOGn3C44DhnG0RZ10jWtXO0kxSljkfXc47Mktpa5oJSpWjxF9zFuVMrXFGIa/8AvcMGkkgB1KwpEmwCuafO4oNmmQ/W3hisBiEockha0+ybQYN7/CqQlTbfoK10h8YbCEhIJgfiUSfeok0Jzni7CYeQ6+kKH3R3le5MmgZ4MxKmylzMniVC8AAfv8RUvD/AGGYSC4gOuc1KFp8EmwqKUFtu/YffkasfSOw4qG2cQsfiS2SPgZqTNcdhHk9u8EONJEQtM6V9ClQkKIgQR86K5lmDOGb1KhIFgkC5PIADnS3hcrOIe+t4hAQPuNdQNivqflTKvqql79gd9GuS5fqUMU4gNoSIZaAgIT1gWk70ucdZ8VqLKD4qPQdDyv40V4z4nDY7JuC4dh08a588So99RXedKdp5yb38pPlUMk3NloQ4o17UbDvn/tH6n4DzrRtMmPbVySNh7t/T31MhlSiEkXJENpG55aunqSfCrTmGKQQ4oNp2DaZK1efOPO3hUrS0VpvbKWtf/USPAEW91e1dTjUp7oYFvxKE+tqyl5P0/wBDcV6/7GFrHPYY9liJSR7KzJQuOvQ1Z+u4nFJliGkfjULk84HTxroma5GziW9krSRSRiuH8TgyVYc9q1/0lbj+k1stS+zMVNewOGT5ii6cSlXgof2qfCs5k7KVrQ0E/eCQdXlRTKuIGnTpMocG6F2P96r51xEhp5DK7JIkqNh4CaCUrqg2io3gswDiR9a1tkwo6RYeFvjXmNzNjCq7LDOJ+sOKhanCTBP3lq39KZcqxyHkko2Bik76Ssu1FK22iVCStYFtPKetdF3Kmc1qw83keOX3jj1CeSUJj0rZeSZgClH11SkKVCyEpCkpvcH3D1rXgjidt9tLXsuIABSTvFpHWmtDoFybUHKUXX/w5JMAOcFqItjcQD4rkT5UI4kybHNpDgU26EC6ko0rI6kiD7qcBjErcCQoQBJvv0q2+ylxJQq6TYjqKKyyi1Z3FPoWuD81RiWx2eJcbcHtNrUle3PvCSPWmRKcUnZbSx4pUn4gn5Ur8R8DoX9rhvsnU3GmwMeWxojwJm7zzKg+mFtqKCr8Uc6adNcogXowwnG4kbsIV/S5+6a3GaPc8M56KQf/ACpfz5rCYVX1hxxxBJnQhau8d/ZmhbnHGLxKSMHhFwdnFHb02PvrlC1aWg2OLmfKT7WHdHmW/wD51Hj+JSy2p1eHcCEiSSW9v91JuScEOYodtjnnSok/ZyREHn/amzB5GyWywoKW2gwErUVDkRM71zUE/UGzzL+LfrABZQ2Z5KeSD6gSavFeLVt2KP8Acr9qE5nwPhVpV2bfZrjuqSSIPKhzWWZsykBGJbdCRELT08d6NQf00vc7a7DGb4fFJRqDrjp/A0G0fFUn41RybCatbmLw2hKRIU672h8ZBkCswfFWIbWhvF4bRqISHGzKZO0jcVV+lRbqsL9kFFIMrj8I/SaKu1F1vzQH6itxFmCcdjENIKjhEqSD2aFQBzJgdbTyFdQybKWGGwhltKExyG/iTuTS9wVm2Baw7aG3m0qKQVSQCVHeZ50zKzFoCS4iDt3hXZZN1FLSDFGYnHIb/wAwgdCajyvO2MRq7FwL0GFRyNVswwGFxMdqlt2NpINWsFgmmU6WkJQnokAVF1X3GEf6Zl/ZNDtI7x7nW2/p+tMXBLxVhWgWC0AgASRfxgXvvelL6UcucdebdbBcSkQUpuRedqamOJ8OhlBJIJAAbg6pFo071eSbgkhF9TYQzZh5Taw0tIXHd1AwD4xvS/g81Xh2k4fX9ZxN5I2BJnvHkBVlz6zid5ZaPL75H6VMhpjDIOkBPUnc+JNTtRVPYyTfRVwmUnX9YxKg47yH3UeCR+tBOL+Lg39k33nDyHLxNUOJOMNcoaUAnmuRt4Dc0pM61qJQdKbytQPmLiTNQlkcv3ReMEjZ1cqKnFnvchdSvlb3J8KzDoUoTPZoECQRPvt7hv41s0oAw0krXMa78zyi/wDzyrxZUFTq1qE7RpHW5EDyEm3KpbKlg4gtjQynQPvLtqjkSZgesb7VTS+kKJQCtR++qTyvbn+njXqwF+2pRWTZCRbxPh5m/nWEd2CRoHIHuj+pW6j4J+FFL1BZ6Xk83lT4Ex6aRHurK9bcVFguPytpj0m9ZXfvf/Dv3r/o5ZDxU5hVFIcU8NUKBsArwJAjyCY8a6HkefM4xJiQoHvAjbwPI+lZWVSPRGaK2e8IMvDvIE8iLEetKWY8NYhm40Ptj7rsah5K/evayqwkybSLGR8QMH7PRoUN0x+qbUdWhKhe4NZWV2RJPRyOdZhkJbzFAwx06iFdIv3h5Gujqw4WgoVcEQaysrpvoCAmCyFrDEkvOdnuEG8eRia3xHH2DbMFap/oV+1ZWUyXPs5C5mf0gYjEEtYZsCdlEiY9SAKPcIYzEadGIZQBHcKCPiJ+NZWUZKlo4UuMO0OMSvEI0tAgaQrV3AZPPn0rq2VLbLSC2AEEDSAItyrKyjm+iII9lpSjFqS8ZxQ5h3HEuIVOqRp0ERy3INZWUuFX2GQxcOZwt9kOON6D0kGR1tQPjTjpDCFIZVL210mBPO4g17WUYwXMPkCOFOG141CcVisQ6qTKUpWREHe23pTsvBtFPZKBWmI7xJnzmsrKE2+QvkUnMlwJ7pYQCbez+1UmPo9wYB1IK7mJUbCbAeArKyhykumGiJ/6PMKLtqdbPVKzQleMewb6GO3W+0qZSr2hHLUeVZWVbC+a+YWehgQziXxulls8kwVR57CrWByZhm4TK+alXJ9TWVlQnJoaKQJ4m4ubw/duVbQBufPaufZpnr+IcCZkkwlKTABO0k7n3CsrKg/M0QKj2FS2ElwySDCQBEz/ACSb+dRFtSmwpZ0tTCQnmbyI6+JgVlZSxdqyjLJw6uzOo6GgNkmSZMXPQnoPTnWjuKMJbQClJ9kCNSvXYDzJPvrKylg77+5z/wDCs2uDoEEztfSDznmo+dqkxCAlZCiVLTy2CbeFvRNvGsrKo+/wKul7lt3MFIOk4laSI7qUCBImBevKysoLGv2gOTP/2Q==);\r\n" + 
		    				"	  background-repeat: no-repeat;\r\n" + 
		    				"	  background-size: 350px 350px; \r\n" + 
		    				" }\r\n" + 
		    				" \r\n" + 
		    				" .text-steak{\r\n" + 
		    				" 		  line-height: 0.7;\r\n" + 
		    				"         letter-spacing: normal;\r\n" + 
		    				"	  margin-left: 60%;\r\n" + 
		    				"	  padding-center: 150px; \r\n" + 
		    				"	  text-align: left;\r\n" + 
		    				"	  font-size:25px;\r\n" + 
		    				"	  top: 10%;\r\n" + 
		    				"	  left: 600%;\r\n" + 
		    				"	  transform: translate(-50%, -50%);\r\n" + 
		    				"	  color: black;\r\n" + 
		    				" 		}\r\n" + 
		    				"\r\n" + 
		    				".salmon-image{\r\n" + 
		    				"  		  border: 2px solid LightGray;\r\n" + 
		    				" 		  box-sizing: content-box;  \r\n" + 
		    				"	  width: 700px;\r\n" + 
		    				"	  height: 8px;\r\n" + 
		    				"	  padding: 150px; \r\n" + 
		    				" 		  margin: auto;\r\n" + 
		    				"	  background: url(https://myfoodbook.com.au/sites/default/files/styles/car_wd/public/recipe_photo/honey_sriracha_salmon_recolour.jpg);\r\n" + 
		    				"	  background-repeat: no-repeat;\r\n" + 
		    				"	  background-size: 350px 350px; \r\n" + 
		    				"			 }\r\n" + 
		    				" \r\n" + 
		    				" .text-salmon{\r\n" + 
		    				" 		  line-height: 0.7;\r\n" + 
		    				"         letter-spacing: normal;\r\n" + 
		    				"	  margin-left: 60%;\r\n" + 
		    				"	  padding-center: 150px; \r\n" + 
		    				"	  text-align: left;\r\n" + 
		    				"	  font-size:25px;\r\n" + 
		    				"	  top: 10%;\r\n" + 
		    				"	  left: 600%;\r\n" + 
		    				"	  transform: translate(-50%, -50%);\r\n" + 
		    				"	  color: black;\r\n" + 
		    				" 		}\r\n" + 
		    				" 		\r\n" + 
		    				" 		\r\n" + 
		    				"</style>\r\n" + 
		    				"</head>\r\n" + 
		    				"\r\n" + 
		    				"	<body>\r\n" + 
		    				"	\r\n" + 
		    				 					
		    				"					<ul class=\"menue\">\r\n" + 
		    				"					 <li><a href=\"homeForMember\">Home</a></li>  \r\n" + 
		    				"						<li><a href=\"about.html\">About </a></li>\r\n" + 
		    				"						<li><a href=\"profile.html\">Profile</a></li>\r\n" + 
		    								 
		    				"					  </ul>\r\n"
		    				+ "<br>" + 
		    				"<div class=\"ForAll\">\r\n" +
		    				"		 </div>\r\n" + 
		    				"	\r\n" + 
		    				"	\r\n" + 
		    				"	\r\n" + 
		    				"		<div class=\"cooking-image\"></div>\r\n" + 
		    				"		<div class=\"text-title\">\r\n" + 
		    				"			<h1>Cooking Courses</h1>\r\n" + 
		    				"		</div>\r\n"
		    				+ "</div>" + 
		    				"		\r\n" + 
		    				"		<br>\r\n" + 
		    				"		<br>\r\n" + 
		    				"		<br>\r\n" + 
		    				"		\r\n" + 
		    				"	  	<div class=lazania-image>  \r\n" + 
		    				"		  <div class=\"text-lazania\">\r\n" + 
		    				"			<h3>Recipe: Lazania </h3>\r\n" + 
		    				"			<h3> Date: 30/6/2021</h3> \r\n" + 
		    				"			<a href=\"lazaniaMore.html\" class=\"button\">More</a>	\r\n" + 
		    				"			</div>\r\n" + 
		    				"	      </div>\r\n" + 
		    				"   \r\n" + 
		    				"	   <br>\r\n" + 
		    				"	   <br>\r\n" + 
		    				"	   <br>\r\n" + 
		    				"	   \r\n" + 
		    				"	  	<div class=steak-image>  \r\n" + 
		    				"		  <div class=\"text-steak\">\r\n" + 
		    				"			<h3>Recipe: Steak</h3>\r\n" + 
		    				"			<h3> Date: 20/4/2021</h3> \r\n" + 
		    				"			<a href=\"steakMore.html\" class=\"button\">More</a>	\r\n" + 
		    				"	      </div>\r\n" + 
		    				"	    </div>\r\n" + 
		    				"	    \r\n" + 
		    				"	   <br>\r\n" + 
		    				"	   <br>\r\n" + 
		    				"	   <br>\r\n" + 
		    				"	   \r\n" + 
		    				"	  	<div class=salmon-image>  \r\n" + 
		    				"		  <div class=\"text-salmon\">\r\n" + 
		    				"			<h3>Recipe: Salmon</h3>\r\n" + 
		    				"			<h3> Date: 16/4/2021</h3> \r\n" + 
		    				"			   	<a href=\"salmonMore.html\" class=\"button\">More</a>	 \r\n" + 
		    				"	      </div>\r\n" + 
		    				"	    </div>\r\n" + 
		    				"	 \r\n" + 
		    				"	</body>\r\n" + 
		    				"	\r\n" + 
		    				"</html>");
		  }
       
}
