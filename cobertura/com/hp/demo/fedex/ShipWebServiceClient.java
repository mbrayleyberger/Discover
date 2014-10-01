<tr class="noCover">
<td class="line"><a name='1'/>1</td>
<td class="hits"/>
<td class="code">package&nbsp;com.hp.demo.fedex;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='2'/>2</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='3'/>3</td>
<td class="hits"/>
<td class="code">import&nbsp;com.fedex.ship.stub.*;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='4'/>4</td>
<td class="hits"/>
<td class="code">import&nbsp;org.apache.axis.types.NonNegativeInteger;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='5'/>5</td>
<td class="hits"/>
<td class="code">import&nbsp;org.apache.axis.types.PositiveInteger;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='6'/>6</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='7'/>7</td>
<td class="hits"/>
<td class="code">import&nbsp;java.io.File;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='8'/>8</td>
<td class="hits"/>
<td class="code">import&nbsp;java.io.FileOutputStream;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='9'/>9</td>
<td class="hits"/>
<td class="code">import&nbsp;java.math.BigDecimal;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='10'/>10</td>
<td class="hits"/>
<td class="code">import&nbsp;java.util.Calendar;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='11'/>11</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='12'/>12</td>
<td class="hits"/>
<td class="code">/**&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='13'/>13</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;Sample&nbsp;code&nbsp;to&nbsp;call&nbsp;the&nbsp;FedEx&nbsp;Ship&nbsp;Service</td>
</tr>
<tr class="noCover">
<td class="line"><a name='14'/>14</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&lt;p&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='15'/>15</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;com.fedex.ship.stub&nbsp;is&nbsp;generated&nbsp;via&nbsp;WSDL2Java,&nbsp;like&nbsp;this:&lt;br&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='16'/>16</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&lt;pre&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='17'/>17</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;java&nbsp;org.apache.axis.wsdl.WSDL2Java&nbsp;-w&nbsp;-p&nbsp;com.fedex.ship.stub&nbsp;http://www.fedex.com/...../ShipService?wsdl</td>
</tr>
<tr class="noCover">
<td class="line"><a name='18'/>18</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;&lt;/pre&gt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='19'/>19</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='20'/>20</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;This&nbsp;sample&nbsp;code&nbsp;has&nbsp;been&nbsp;tested&nbsp;with&nbsp;JDK&nbsp;5&nbsp;and&nbsp;Apache&nbsp;Axis&nbsp;1.4</td>
</tr>
<tr class="noCover">
<td class="line"><a name='21'/>21</td>
<td class="hits"/>
<td class="code">&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='22'/>22</td>
<td class="hits"/>
<td class="code">//&nbsp;a&nbsp;change&nbsp;fixes&nbsp;defect&nbsp;#1</td>
</tr>
<tr class="noCover">
<td class="line"><a name='23'/>23</td>
<td class="hits"/>
<td class="code">//&nbsp;second&nbsp;change</td>
</tr>
<tr class="noCover">
<td class="line"><a name='24'/>24</td>
<td class="hits"/>
<td class="code">//&nbsp;third&nbsp;change</td>
</tr>
<tr class="noCover">
<td class="line"><a name='25'/>25</td>
<td class="hits"/>
<td class="code">//&nbsp;fourth&nbsp;change</td>
</tr>
<tr class="noCover">
<td class="line"><a name='26'/>26</td>
<td class="hits"/>
<td class="code">//&nbsp;fifth&nbsp;change</td>
</tr>
<tr class="noCover">
<td class="line"><a name='27'/>27</td>
<td class="hits"/>
<td class="code">//&nbsp;onew&nbsp;more</td>
</tr>
<tr class="noCover">
<td class="line"><a name='28'/>28</td>
<td class="hits"/>
<td class="code">//Sample&nbsp;code&nbsp;to&nbsp;call&nbsp;the&nbsp;FedEx&nbsp;Ship&nbsp;Service&nbsp;-&nbsp;Domestic&nbsp;Express</td>
</tr>
<tr class="noCover">
<td class="line"><a name='29'/>29</td>
<td class="hits"/>
<td class="code">//test&nbsp;11032014&nbsp;blabla&nbsp;aaabbb</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='30'/>30</td>
<td class="hits">0</td>
<td class="code">public&nbsp;class&nbsp;ShipWebServiceClient&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='31'/>31</td>
<td class="hits"/>
<td class="code">{</td>
</tr>
<tr class="noCover">
<td class="line"><a name='32'/>32</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;static&nbsp;final&nbsp;String&nbsp;LABEL_LOCATION;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='33'/>33</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;static&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='34'/>34</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;LABEL_LOCATION&nbsp;=&nbsp;System.getProperty("java.io.tmpdir")+"\\SV_FedEx_Demo_";</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='35'/>35</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='36'/>36</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;//</td>
</tr>
<tr class="noCover">
<td class="line"><a name='37'/>37</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;static&nbsp;void&nbsp;main(String[]&nbsp;args)&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='38'/>38</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='39'/>39</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ProcessShipmentRequest&nbsp;request&nbsp;=&nbsp;buildRequest();</td>
</tr>
<tr class="noCover">
<td class="line"><a name='40'/>40</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//</td>
</tr>
<tr class="noCover">
<td class="line"><a name='41'/>41</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;try&nbsp;{</td>
</tr>
<tr class="noCover">
<td class="line"><a name='42'/>42</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//&nbsp;Initialize&nbsp;the&nbsp;service</td>
</tr>
<tr class="noCover">
<td class="line"><a name='43'/>43</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ShipServiceLocator&nbsp;service;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='44'/>44</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ShipPortType&nbsp;port;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='45'/>45</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='46'/>46</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;service&nbsp;=&nbsp;new&nbsp;ShipServiceLocator();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='47'/>47</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;updateEndPoint(service);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='48'/>48</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;port&nbsp;=&nbsp;service.getShipServicePort();</td>
</tr>
<tr class="noCover">
<td class="line"><a name='49'/>49</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='50'/>50</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ProcessShipmentReply&nbsp;reply&nbsp;=&nbsp;port.processShipment(request);&nbsp;//&nbsp;This&nbsp;is&nbsp;the&nbsp;call&nbsp;to&nbsp;the&nbsp;ship&nbsp;web&nbsp;service&nbsp;passing&nbsp;in&nbsp;a&nbsp;request&nbsp;object&nbsp;and&nbsp;returning&nbsp;a&nbsp;reply&nbsp;object</td>
</tr>
<tr class="noCover">
<td class="line"><a name='51'/>51</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='52'/>52</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if&nbsp;(isResponseOk(reply.getHighestSeverity()))&nbsp;//&nbsp;check&nbsp;if&nbsp;the&nbsp;call&nbsp;was&nbsp;successful</td>
</tr>
<tr class="noCover">
<td class="line"><a name='53'/>53</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='54'/>54</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;writeServiceOutput(reply);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='55'/>55</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='56'/>56</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="coverNone">
<td class="line"><a name='57'/>57</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;printNotifications(reply.getNotifications());</td>
</tr>
<tr class="noCover">
<td class="line"><a name='58'/>58</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="coverNone">
<td class="line"><a name='59'/>59</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;catch&nbsp;(Exception&nbsp;e)&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='60'/>60</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;e.printStackTrace();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='61'/>61</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='62'/>62</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='63'/>63</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='64'/>64</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;static&nbsp;ProcessShipmentRequest&nbsp;buildRequest()</td>
</tr>
<tr class="noCover">
<td class="line"><a name='65'/>65</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='66'/>66</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ProcessShipmentRequest&nbsp;request&nbsp;=&nbsp;new&nbsp;ProcessShipmentRequest();&nbsp;//&nbsp;Build&nbsp;a&nbsp;request&nbsp;object</td>
</tr>
<tr class="noCover">
<td class="line"><a name='67'/>67</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="coverNone">
<td class="line"><a name='68'/>68</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;request.setClientDetail(createClientDetail());</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='69'/>69</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;request.setWebAuthenticationDetail(createWebAuthenticationDetail());</td>
</tr>
<tr class="noCover">
<td class="line"><a name='70'/>70</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//&nbsp;</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='71'/>71</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;TransactionDetail&nbsp;transactionDetail&nbsp;=&nbsp;new&nbsp;TransactionDetail();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='72'/>72</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;transactionDetail.setCustomerTransactionId("java&nbsp;sample&nbsp;-&nbsp;Domestic&nbsp;Express&nbsp;Ship&nbsp;Request");&nbsp;//&nbsp;The&nbsp;client&nbsp;will&nbsp;get&nbsp;the&nbsp;same&nbsp;value&nbsp;back&nbsp;in&nbsp;the&nbsp;response</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='73'/>73</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;request.setTransactionDetail(transactionDetail);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='74'/>74</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='75'/>75</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='76'/>76</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;VersionId&nbsp;versionId&nbsp;=&nbsp;new&nbsp;VersionId("ship",&nbsp;9,&nbsp;0,&nbsp;0);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='77'/>77</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;request.setVersion(versionId);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='78'/>78</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='79'/>79</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;RequestedShipment&nbsp;requestedShipment&nbsp;=&nbsp;new&nbsp;RequestedShipment();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='80'/>80</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;requestedShipment.setShipTimestamp(Calendar.getInstance());&nbsp;//&nbsp;Ship&nbsp;date&nbsp;and&nbsp;time</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='81'/>81</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;requestedShipment.setDropoffType(DropoffType.REGULAR_PICKUP);&nbsp;//&nbsp;Dropoff&nbsp;Types&nbsp;are&nbsp;BUSINESS_SERVICE_CENTER,&nbsp;DROP_BOX,&nbsp;REGULAR_PICKUP,&nbsp;REQUEST_COURIER,&nbsp;STATION</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='82'/>82</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;requestedShipment.setServiceType(ServiceType.PRIORITY_OVERNIGHT);&nbsp;//&nbsp;Service&nbsp;types&nbsp;are&nbsp;STANDARD_OVERNIGHT,&nbsp;PRIORITY_OVERNIGHT,&nbsp;FEDEX_GROUND&nbsp;...</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='83'/>83</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;requestedShipment.setPackagingType(PackagingType.YOUR_PACKAGING);&nbsp;//&nbsp;Packaging&nbsp;type&nbsp;FEDEX_BOX,&nbsp;FEDEX_PAK,&nbsp;FEDEX_TUBE,&nbsp;YOUR_PACKAGING,&nbsp;...</td>
</tr>
<tr class="noCover">
<td class="line"><a name='84'/>84</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='85'/>85</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Weight&nbsp;weight&nbsp;=&nbsp;new&nbsp;Weight();&nbsp;//&nbsp;Total&nbsp;weight&nbsp;information</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='86'/>86</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;weight.setValue(new&nbsp;BigDecimal(50.0));</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='87'/>87</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;weight.setUnits(WeightUnits.LB);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='88'/>88</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;requestedShipment.setTotalWeight(weight);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='89'/>89</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='90'/>90</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='91'/>91</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Party&nbsp;shipperParty&nbsp;=&nbsp;new&nbsp;Party();&nbsp;//&nbsp;Sender&nbsp;information</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='92'/>92</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Contact&nbsp;shipperContact&nbsp;=&nbsp;new&nbsp;Contact();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='93'/>93</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;shipperContact.setPersonName("Sender&nbsp;Name");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='94'/>94</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;shipperContact.setCompanyName("Sender&nbsp;Company&nbsp;Name");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='95'/>95</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;shipperContact.setPhoneNumber("0805522713");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='96'/>96</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Address&nbsp;shipperAddress&nbsp;=&nbsp;new&nbsp;Address();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='97'/>97</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;shipperAddress.setStreetLines(new&nbsp;String[]&nbsp;{"Address&nbsp;Line&nbsp;1"});</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='98'/>98</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;shipperAddress.setCity("Austin");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='99'/>99</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;shipperAddress.setStateOrProvinceCode("TX");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='100'/>100</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;shipperAddress.setPostalCode("73301");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='101'/>101</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;shipperAddress.setCountryCode("US");&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='102'/>102</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;shipperParty.setContact(shipperContact);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='103'/>103</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;shipperParty.setAddress(shipperAddress);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='104'/>104</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;requestedShipment.setShipper(shipperParty);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='105'/>105</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='106'/>106</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Party&nbsp;recipientParty&nbsp;=&nbsp;new&nbsp;Party();&nbsp;//&nbsp;Recipient&nbsp;information</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='107'/>107</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Contact&nbsp;recipientContact&nbsp;=&nbsp;new&nbsp;Contact();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='108'/>108</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;recipientContact.setPersonName("Recipient&nbsp;Name");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='109'/>109</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;recipientContact.setCompanyName("Recipient&nbsp;Company&nbsp;Name");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='110'/>110</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;recipientContact.setPhoneNumber("9012637906");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='111'/>111</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Address&nbsp;recipientAddress&nbsp;=&nbsp;new&nbsp;Address();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='112'/>112</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;recipientAddress.setStreetLines(new&nbsp;String[]&nbsp;{"Address&nbsp;Line&nbsp;1"});</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='113'/>113</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;recipientAddress.setCity("Windsor");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='114'/>114</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;recipientAddress.setStateOrProvinceCode("CT");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='115'/>115</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;recipientAddress.setPostalCode("06006");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='116'/>116</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;recipientAddress.setCountryCode("US");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='117'/>117</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;recipientAddress.setResidential(true);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='118'/>118</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;recipientParty.setContact(recipientContact);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='119'/>119</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;recipientParty.setAddress(recipientAddress);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='120'/>120</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;requestedShipment.setRecipient(recipientParty);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='121'/>121</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='122'/>122</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='123'/>123</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Payment&nbsp;payment&nbsp;=&nbsp;new&nbsp;Payment();&nbsp;//&nbsp;Payment&nbsp;information</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='124'/>124</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;payment.setPaymentType(PaymentType.SENDER);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='125'/>125</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Payor&nbsp;payor&nbsp;=&nbsp;new&nbsp;Payor();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='126'/>126</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;payor.setAccountNumber(getPayorAccountNumber());</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='127'/>127</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;payor.setCountryCode("US");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='128'/>128</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;payment.setPayor(payor);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='129'/>129</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;requestedShipment.setShippingChargesPayment(payment);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='130'/>130</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='131'/>131</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ShipmentSpecialServicesRequested&nbsp;shipmentSpecialServices&nbsp;=&nbsp;new&nbsp;ShipmentSpecialServicesRequested();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='132'/>132</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ShipmentSpecialServiceType&nbsp;shipmentSpecialServiceType[]=new&nbsp;ShipmentSpecialServiceType[1];</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='133'/>133</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;shipmentSpecialServiceType[0]=ShipmentSpecialServiceType.COD;</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='134'/>134</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;shipmentSpecialServices.setSpecialServiceTypes(shipmentSpecialServiceType);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='135'/>135</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CodDetail&nbsp;codDetail&nbsp;=&nbsp;new&nbsp;CodDetail();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='136'/>136</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;codDetail.setCollectionType(CodCollectionType.ANY);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='137'/>137</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Money&nbsp;codMoney&nbsp;=&nbsp;new&nbsp;Money();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='138'/>138</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;codMoney.setCurrency("USD");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='139'/>139</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;codMoney.setAmount(new&nbsp;BigDecimal(150.0));</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='140'/>140</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;codDetail.setCodCollectionAmount(codMoney);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='141'/>141</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;shipmentSpecialServices.setCodDetail(codDetail);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='142'/>142</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;requestedShipment.setSpecialServicesRequested(shipmentSpecialServices);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='143'/>143</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='144'/>144</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='145'/>145</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;requestedShipment.setRequestedPackageLineItems(new&nbsp;RequestedPackageLineItem[]&nbsp;{new&nbsp;RequestedPackageLineItem()});</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='146'/>146</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;requestedShipment.getRequestedPackageLineItems(0).setSequenceNumber(new&nbsp;PositiveInteger("1"));</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='147'/>147</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;requestedShipment.getRequestedPackageLineItems(0).setSpecialServicesRequested(new&nbsp;PackageSpecialServicesRequested());</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='148'/>148</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;requestedShipment.getRequestedPackageLineItems(0).getSpecialServicesRequested().setDryIceWeight(new&nbsp;Weight(WeightUnits.LB,&nbsp;new&nbsp;BigDecimal(10.0)));&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='149'/>149</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='150'/>150</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;LabelSpecification&nbsp;labelSpecification&nbsp;=&nbsp;new&nbsp;LabelSpecification();&nbsp;//&nbsp;Label&nbsp;specification&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='151'/>151</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;labelSpecification.setImageType(ShippingDocumentImageType.PDF);//&nbsp;Image&nbsp;types&nbsp;PDF,&nbsp;PNG,&nbsp;DPL,&nbsp;...&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='152'/>152</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;labelSpecification.setLabelFormatType(LabelFormatType.COMMON2D);&nbsp;//LABEL_DATA_ONLY,&nbsp;COMMON2D</td>
</tr>
<tr class="noCover">
<td class="line"><a name='153'/>153</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//labelSpecification.setLabelStockType(LabelStockType.value2);&nbsp;//&nbsp;STOCK_4X6.75_LEADING_DOC_TAB&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='154'/>154</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//labelSpecification.setLabelPrintingOrientation(LabelPrintingOrientationType.TOP_EDGE_OF_TEXT_FIRST);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='155'/>155</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;requestedShipment.setLabelSpecification(labelSpecification);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='156'/>156</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='157'/>157</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;RateRequestType&nbsp;rateRequestType[]&nbsp;=&nbsp;new&nbsp;RateRequestType[1];</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='158'/>158</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;rateRequestType[0]&nbsp;=&nbsp;RateRequestType.ACCOUNT;&nbsp;//&nbsp;Rate&nbsp;types&nbsp;requested&nbsp;LIST,&nbsp;MULTIWEIGHT,&nbsp;...</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='159'/>159</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;requestedShipment.setRateRequestTypes(rateRequestType);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='160'/>160</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;requestedShipment.setPackageCount(new&nbsp;NonNegativeInteger("1"));</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='161'/>161</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;requestedShipment.setPackageDetail(RequestedPackageDetailType.INDIVIDUAL_PACKAGES);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='162'/>162</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='163'/>163</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;RequestedPackageLineItem&nbsp;rp[]&nbsp;=&nbsp;new&nbsp;RequestedPackageLineItem[1];</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='164'/>164</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Weight&nbsp;rpWeight&nbsp;=&nbsp;new&nbsp;Weight();&nbsp;//&nbsp;Package&nbsp;weight&nbsp;information</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='165'/>165</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;rpWeight.setValue(new&nbsp;BigDecimal(50.0));</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='166'/>166</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;rpWeight.setUnits(WeightUnits.LB);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='167'/>167</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;rp[0]&nbsp;=&nbsp;new&nbsp;RequestedPackageLineItem();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='168'/>168</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;rp[0].setWeight(rpWeight);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='169'/>169</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;rp[0].setSequenceNumber(new&nbsp;PositiveInteger("1"));</td>
</tr>
<tr class="noCover">
<td class="line"><a name='170'/>170</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='171'/>171</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;requestedShipment.setRequestedPackageLineItems(rp);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='172'/>172</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='173'/>173</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;request.setRequestedShipment(requestedShipment);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='174'/>174</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='175'/>175</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;request;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='176'/>176</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='177'/>177</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='178'/>178</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;static&nbsp;void&nbsp;writeServiceOutput(ProcessShipmentReply&nbsp;reply)&nbsp;throws&nbsp;Exception</td>
</tr>
<tr class="noCover">
<td class="line"><a name='179'/>179</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;{</td>
</tr>
<tr class="noCover">
<td class="line"><a name='180'/>180</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;try</td>
</tr>
<tr class="noCover">
<td class="line"><a name='181'/>181</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='182'/>182</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CompletedShipmentDetail&nbsp;csd&nbsp;=&nbsp;reply.getCompletedShipmentDetail();&nbsp;</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='183'/>183</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CompletedPackageDetail&nbsp;cpd[]&nbsp;=&nbsp;csd.getCompletedPackageDetails();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='184'/>184</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("Package&nbsp;details\n");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='185'/>185</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;for&nbsp;(CompletedPackageDetail&nbsp;aCpd&nbsp;:&nbsp;cpd)&nbsp;{&nbsp;//&nbsp;Package&nbsp;details&nbsp;/&nbsp;Rating&nbsp;information&nbsp;for&nbsp;each&nbsp;package</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='186'/>186</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String&nbsp;trackingNumber&nbsp;=&nbsp;aCpd.getTrackingIds()[0].getTrackingNumber();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='187'/>187</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("Tracking&nbsp;#:&nbsp;"&nbsp;+&nbsp;trackingNumber</td>
</tr>
<tr class="noCover">
<td class="line"><a name='188'/>188</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+&nbsp;"&nbsp;Form&nbsp;ID:&nbsp;"&nbsp;+&nbsp;aCpd.getTrackingIds()[0].getFormId());</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='189'/>189</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("\nRate&nbsp;details\n");</td>
</tr>
<tr class="noCover">
<td class="line"><a name='190'/>190</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='191'/>191</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;PackageRateDetail[]&nbsp;prd&nbsp;=&nbsp;aCpd.getPackageRating().getPackageRateDetails();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='192'/>192</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;for&nbsp;(PackageRateDetail&nbsp;aPrd&nbsp;:&nbsp;prd)&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='193'/>193</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if&nbsp;(null&nbsp;!=&nbsp;aPrd.getBillingWeight())</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='194'/>194</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("Billing&nbsp;weight:&nbsp;"&nbsp;+&nbsp;aPrd.getBillingWeight().getValue()</td>
</tr>
<tr class="noCover">
<td class="line"><a name='195'/>195</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+&nbsp;"&nbsp;"&nbsp;+&nbsp;aPrd.getBillingWeight().getUnits());</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='196'/>196</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if&nbsp;(null&nbsp;!=&nbsp;aPrd.getBaseCharge())</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='197'/>197</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("Base&nbsp;charge:&nbsp;"&nbsp;+&nbsp;aPrd.getBaseCharge().getAmount()</td>
</tr>
<tr class="noCover">
<td class="line"><a name='198'/>198</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+&nbsp;"&nbsp;"&nbsp;+&nbsp;aPrd.getBaseCharge().getCurrency());</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='199'/>199</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if&nbsp;(null&nbsp;!=&nbsp;aPrd.getNetCharge())</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='200'/>200</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("Net&nbsp;charge:&nbsp;"&nbsp;+&nbsp;aPrd.getNetCharge().getAmount()</td>
</tr>
<tr class="noCover">
<td class="line"><a name='201'/>201</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+&nbsp;"&nbsp;"&nbsp;+&nbsp;aPrd.getBaseCharge().getCurrency());</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='202'/>202</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if&nbsp;(null&nbsp;!=&nbsp;aPrd.getSurcharges())&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='203'/>203</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Surcharge[]&nbsp;s&nbsp;=&nbsp;aPrd.getSurcharges();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='204'/>204</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;for&nbsp;(Surcharge&nbsp;value&nbsp;:&nbsp;s)&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='205'/>205</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if&nbsp;(null&nbsp;!=&nbsp;value.getSurchargeType())</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='206'/>206</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println(value.getSurchargeType()&nbsp;+&nbsp;"&nbsp;surcharge&nbsp;"&nbsp;+</td>
</tr>
<tr class="noCover">
<td class="line"><a name='207'/>207</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;value.getAmount().getAmount()&nbsp;+&nbsp;"&nbsp;"&nbsp;+&nbsp;value.getAmount().getCurrency());</td>
</tr>
<tr class="noCover">
<td class="line"><a name='208'/>208</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='209'/>209</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='210'/>210</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if&nbsp;(null&nbsp;!=&nbsp;aPrd.getTotalSurcharges())</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='211'/>211</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("Total&nbsp;surcharge:&nbsp;"&nbsp;+&nbsp;aPrd.getTotalSurcharges().getAmount()&nbsp;+&nbsp;"&nbsp;"&nbsp;+</td>
</tr>
<tr class="noCover">
<td class="line"><a name='212'/>212</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;aPrd.getTotalSurcharges().getCurrency());</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='213'/>213</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("\nRouting&nbsp;details\n");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='214'/>214</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if&nbsp;(null&nbsp;!=&nbsp;csd.getRoutingDetail().getUrsaPrefixCode())</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='215'/>215</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("URSA&nbsp;prefix:&nbsp;"&nbsp;+&nbsp;csd.getRoutingDetail().getUrsaPrefixCode()</td>
</tr>
<tr class="noCover">
<td class="line"><a name='216'/>216</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+&nbsp;"&nbsp;suffix:&nbsp;"&nbsp;+&nbsp;csd.getRoutingDetail().getUrsaSuffixCode());</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='217'/>217</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if&nbsp;(null&nbsp;!=&nbsp;csd.getRoutingDetail().getCommitDay())</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='218'/>218</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("Service&nbsp;commitment:&nbsp;"&nbsp;+&nbsp;csd.getRoutingDetail().getCommitDay()</td>
</tr>
<tr class="noCover">
<td class="line"><a name='219'/>219</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+&nbsp;"&nbsp;Airport&nbsp;ID:&nbsp;"&nbsp;+&nbsp;csd.getRoutingDetail().getAirportId());</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='220'/>220</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if&nbsp;(null&nbsp;!=&nbsp;csd.getRoutingDetail().getDeliveryDay())</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='221'/>221</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("Delivery&nbsp;day:&nbsp;"&nbsp;+&nbsp;csd.getRoutingDetail().getDeliveryDay());</td>
</tr>
<tr class="noCover">
<td class="line"><a name='222'/>222</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='223'/>223</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//&nbsp;&nbsp;&nbsp;&nbsp;Write&nbsp;label&nbsp;buffer&nbsp;to&nbsp;file</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='224'/>224</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ShippingDocument&nbsp;sd&nbsp;=&nbsp;aCpd.getLabel();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='225'/>225</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;saveLabelToFile(sd,&nbsp;trackingNumber);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='226'/>226</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CodReturnShipmentDetail&nbsp;detail&nbsp;=&nbsp;csd.getCodReturnDetail();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='227'/>227</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if&nbsp;(detail&nbsp;!=&nbsp;null&nbsp;&amp;&amp;&nbsp;detail.getLabel()&nbsp;!=&nbsp;null)&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='228'/>228</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ShippingDocument&nbsp;codLabel&nbsp;=&nbsp;detail.getLabel();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='229'/>229</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;saveCodLabelToFile(codLabel,&nbsp;trackingNumber);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='230'/>230</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='231'/>231</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='232'/>232</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;catch&nbsp;(Exception&nbsp;e)&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='233'/>233</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;e.printStackTrace();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='234'/>234</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='235'/>235</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='236'/>236</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='237'/>237</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;static&nbsp;void&nbsp;saveCodLabelToFile(ShippingDocument&nbsp;shippingDocument,&nbsp;String&nbsp;trackingNumber)&nbsp;throws&nbsp;Exception&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='238'/>238</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ShippingDocumentPart[]&nbsp;sdparts&nbsp;=&nbsp;shippingDocument.getParts();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='239'/>239</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;for&nbsp;(int&nbsp;a=0;&nbsp;a&nbsp;&lt;&nbsp;sdparts.length;&nbsp;a++)&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='240'/>240</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ShippingDocumentPart&nbsp;sdpart&nbsp;=&nbsp;sdparts[a];</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='241'/>241</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String&nbsp;labelLocation&nbsp;=&nbsp;System.getProperty("file.label.location");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='242'/>242</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if&nbsp;(labelLocation&nbsp;==&nbsp;null)&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='243'/>243</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;labelLocation&nbsp;=&nbsp;LABEL_LOCATION;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='244'/>244</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='245'/>245</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String&nbsp;codLabelFileName&nbsp;=&nbsp;&nbsp;labelLocation&nbsp;+&nbsp;"cod_label."&nbsp;+&nbsp;trackingNumber&nbsp;+&nbsp;"_"&nbsp;+&nbsp;a&nbsp;+&nbsp;".pdf";</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='246'/>246</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;File&nbsp;codLabelFile&nbsp;=&nbsp;new&nbsp;File(codLabelFileName);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='247'/>247</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;FileOutputStream&nbsp;fos&nbsp;=&nbsp;new&nbsp;FileOutputStream(&nbsp;codLabelFile&nbsp;);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='248'/>248</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;fos.write(sdpart.getImage());</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='249'/>249</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;fos.close();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='250'/>250</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("\nCod&nbsp;return&nbsp;label&nbsp;file&nbsp;name&nbsp;"&nbsp;+&nbsp;codLabelFile.getAbsolutePath());</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='251'/>251</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Runtime.getRuntime().exec("rundll32&nbsp;url.dll,FileProtocolHandler&nbsp;"&nbsp;+&nbsp;codLabelFile.getAbsolutePath());</td>
</tr>
<tr class="noCover">
<td class="line"><a name='252'/>252</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='253'/>253</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='254'/>254</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='255'/>255</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;static&nbsp;void&nbsp;saveLabelToFile(ShippingDocument&nbsp;shippingDocument,&nbsp;String&nbsp;trackingNumber)&nbsp;throws&nbsp;Exception&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='256'/>256</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ShippingDocumentPart[]&nbsp;sdparts&nbsp;=&nbsp;shippingDocument.getParts();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='257'/>257</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;for&nbsp;(int&nbsp;a=0;&nbsp;a&nbsp;&lt;&nbsp;sdparts.length;&nbsp;a++)&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='258'/>258</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ShippingDocumentPart&nbsp;sdpart&nbsp;=&nbsp;sdparts[a];</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='259'/>259</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String&nbsp;labelLocation&nbsp;=&nbsp;System.getProperty("file.label.location");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='260'/>260</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if&nbsp;(labelLocation&nbsp;==&nbsp;null)&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='261'/>261</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;labelLocation&nbsp;=&nbsp;LABEL_LOCATION;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='262'/>262</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='263'/>263</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String&nbsp;labelFileName&nbsp;=&nbsp;&nbsp;labelLocation&nbsp;+&nbsp;"shipping_label."&nbsp;+&nbsp;trackingNumber&nbsp;+&nbsp;"_"&nbsp;+&nbsp;a&nbsp;+&nbsp;".pdf";</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='264'/>264</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;File&nbsp;labelFile&nbsp;=&nbsp;new&nbsp;File(labelFileName);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='265'/>265</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;FileOutputStream&nbsp;fos&nbsp;=&nbsp;new&nbsp;FileOutputStream(&nbsp;labelFile&nbsp;);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='266'/>266</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;fos.write(sdpart.getImage());</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='267'/>267</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;fos.close();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='268'/>268</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("\nlabel&nbsp;file&nbsp;name&nbsp;"&nbsp;+&nbsp;labelFile.getAbsolutePath());</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='269'/>269</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Runtime.getRuntime().exec("rundll32&nbsp;url.dll,FileProtocolHandler&nbsp;"&nbsp;+&nbsp;labelFile.getAbsolutePath());</td>
</tr>
<tr class="noCover">
<td class="line"><a name='270'/>270</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='271'/>271</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='272'/>272</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='273'/>273</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;static&nbsp;String&nbsp;getPayorAccountNumber()&nbsp;{</td>
</tr>
<tr class="noCover">
<td class="line"><a name='274'/>274</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//&nbsp;See&nbsp;if&nbsp;payor&nbsp;account&nbsp;number&nbsp;is&nbsp;set&nbsp;as&nbsp;system&nbsp;property,</td>
</tr>
<tr class="noCover">
<td class="line"><a name='275'/>275</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//&nbsp;if&nbsp;not&nbsp;default&nbsp;it&nbsp;to&nbsp;"XXX"</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='276'/>276</td>
<td class="hits">2</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String&nbsp;payorAccountNumber&nbsp;=&nbsp;System.getProperty("Payor.AccountNumber");</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='277'/>277</td>
<td class="hits">2</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if&nbsp;(payorAccountNumber&nbsp;==&nbsp;null)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='278'/>278</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;payorAccountNumber&nbsp;=&nbsp;"510087720";&nbsp;//&nbsp;Replace&nbsp;"XXX"&nbsp;with&nbsp;the&nbsp;payor&nbsp;account&nbsp;number</td>
</tr>
<tr class="noCover">
<td class="line"><a name='279'/>279</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='280'/>280</td>
<td class="hits">2</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;payorAccountNumber;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='281'/>281</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='282'/>282</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='283'/>283</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;static&nbsp;boolean&nbsp;isResponseOk(NotificationSeverityType&nbsp;notificationSeverityType)&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='284'/>284</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if&nbsp;(notificationSeverityType&nbsp;==&nbsp;null)&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='285'/>285</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;false;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='286'/>286</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='287'/>287</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if&nbsp;(notificationSeverityType.equals(NotificationSeverityType.WARNING)&nbsp;||</td>
</tr>
<tr class="noCover">
<td class="line"><a name='288'/>288</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;notificationSeverityType.equals(NotificationSeverityType.NOTE)&nbsp;&nbsp;&nbsp;&nbsp;||</td>
</tr>
<tr class="noCover">
<td class="line"><a name='289'/>289</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;notificationSeverityType.equals(NotificationSeverityType.SUCCESS))&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='290'/>290</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;true;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='291'/>291</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='292'/>292</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;false;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='293'/>293</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='294'/>294</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='295'/>295</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;static&nbsp;ClientDetail&nbsp;createClientDetail()&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='296'/>296</td>
<td class="hits">2</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ClientDetail&nbsp;clientDetail&nbsp;=&nbsp;new&nbsp;ClientDetail();</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='297'/>297</td>
<td class="hits">2</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String&nbsp;accountNumber&nbsp;=&nbsp;System.getProperty("accountNumber");</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='298'/>298</td>
<td class="hits">2</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String&nbsp;meterNumber&nbsp;=&nbsp;System.getProperty("meterNumber");</td>
</tr>
<tr class="noCover">
<td class="line"><a name='299'/>299</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='300'/>300</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//</td>
</tr>
<tr class="noCover">
<td class="line"><a name='301'/>301</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//&nbsp;See&nbsp;if&nbsp;the&nbsp;accountNumber&nbsp;and&nbsp;meterNumber&nbsp;properties&nbsp;are&nbsp;set,</td>
</tr>
<tr class="noCover">
<td class="line"><a name='302'/>302</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//&nbsp;if&nbsp;set&nbsp;use&nbsp;those&nbsp;values,&nbsp;otherwise&nbsp;default&nbsp;them&nbsp;to&nbsp;"XXX"</td>
</tr>
<tr class="noCover">
<td class="line"><a name='303'/>303</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='304'/>304</td>
<td class="hits">2</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if&nbsp;(accountNumber&nbsp;==&nbsp;null)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='305'/>305</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;accountNumber&nbsp;=&nbsp;"510087720";&nbsp;//&nbsp;Replace&nbsp;"XXX"&nbsp;with&nbsp;clients&nbsp;account&nbsp;number</td>
</tr>
<tr class="noCover">
<td class="line"><a name='306'/>306</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='307'/>307</td>
<td class="hits">2</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if&nbsp;(meterNumber&nbsp;==&nbsp;null)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='308'/>308</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;meterNumber&nbsp;=&nbsp;"118542640";&nbsp;//&nbsp;Replace&nbsp;"XXX"&nbsp;with&nbsp;clients&nbsp;meter&nbsp;number</td>
</tr>
<tr class="noCover">
<td class="line"><a name='309'/>309</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='310'/>310</td>
<td class="hits">2</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;clientDetail.setAccountNumber(accountNumber);</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='311'/>311</td>
<td class="hits">2</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;clientDetail.setMeterNumber(meterNumber);</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='312'/>312</td>
<td class="hits">2</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;clientDetail;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='313'/>313</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='314'/>314</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='315'/>315</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;static&nbsp;WebAuthenticationDetail&nbsp;createWebAuthenticationDetail()&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='316'/>316</td>
<td class="hits">2</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;WebAuthenticationCredential&nbsp;wac&nbsp;=&nbsp;new&nbsp;WebAuthenticationCredential();</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='317'/>317</td>
<td class="hits">2</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String&nbsp;key&nbsp;=&nbsp;System.getProperty("key");</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='318'/>318</td>
<td class="hits">2</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String&nbsp;password&nbsp;=&nbsp;System.getProperty("password");</td>
</tr>
<tr class="noCover">
<td class="line"><a name='319'/>319</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='320'/>320</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//</td>
</tr>
<tr class="noCover">
<td class="line"><a name='321'/>321</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//&nbsp;See&nbsp;if&nbsp;the&nbsp;key&nbsp;and&nbsp;password&nbsp;properties&nbsp;are&nbsp;set,</td>
</tr>
<tr class="noCover">
<td class="line"><a name='322'/>322</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//&nbsp;if&nbsp;set&nbsp;use&nbsp;those&nbsp;values,&nbsp;otherwise&nbsp;default&nbsp;them&nbsp;to&nbsp;"XXX"</td>
</tr>
<tr class="noCover">
<td class="line"><a name='323'/>323</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='324'/>324</td>
<td class="hits">2</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if&nbsp;(key&nbsp;==&nbsp;null)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='325'/>325</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;key&nbsp;=&nbsp;"3uO3sffShhP2b77G";&nbsp;//&nbsp;Replace&nbsp;"XXX"&nbsp;with&nbsp;clients&nbsp;key</td>
</tr>
<tr class="noCover">
<td class="line"><a name='326'/>326</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='327'/>327</td>
<td class="hits">2</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if&nbsp;(password&nbsp;==&nbsp;null)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='328'/>328</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;password&nbsp;=&nbsp;"OKdkJWvqzroVK4E2xt1LiQ8iE";&nbsp;//&nbsp;Replace&nbsp;"XXX"&nbsp;with&nbsp;clients&nbsp;password</td>
</tr>
<tr class="noCover">
<td class="line"><a name='329'/>329</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='330'/>330</td>
<td class="hits">2</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;wac.setKey(key);</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='331'/>331</td>
<td class="hits">2</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;wac.setPassword(password);</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='332'/>332</td>
<td class="hits">2</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;new&nbsp;WebAuthenticationDetail(wac);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='333'/>333</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='334'/>334</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='335'/>335</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;static&nbsp;void&nbsp;printNotifications(Notification[]&nbsp;notifications)&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='336'/>336</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("Notifications:");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='337'/>337</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if&nbsp;(notifications&nbsp;==&nbsp;null&nbsp;||&nbsp;notifications.length&nbsp;==&nbsp;0)&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='338'/>338</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("&nbsp;&nbsp;No&nbsp;notifications&nbsp;returned");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='339'/>339</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='340'/>340</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='341'/>341</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;for&nbsp;(int&nbsp;i=0;&nbsp;i&nbsp;&lt;&nbsp;notifications.length;&nbsp;i++){</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='342'/>342</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Notification&nbsp;n&nbsp;=&nbsp;notifications[i];</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='343'/>343</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.print("&nbsp;&nbsp;Notification&nbsp;no.&nbsp;"&nbsp;+&nbsp;i&nbsp;+&nbsp;":&nbsp;");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='344'/>344</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if&nbsp;(n&nbsp;==&nbsp;null)&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='345'/>345</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("null");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='346'/>346</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;continue;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='347'/>347</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;else&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='348'/>348</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("");</td>
</tr>
<tr class="noCover">
<td class="line"><a name='349'/>349</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='350'/>350</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;NotificationSeverityType&nbsp;nst&nbsp;=&nbsp;n.getSeverity();</td>
</tr>
<tr class="noCover">
<td class="line"><a name='351'/>351</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="coverNone">
<td class="line"><a name='352'/>352</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("&nbsp;&nbsp;&nbsp;&nbsp;Severity:&nbsp;"&nbsp;+&nbsp;(nst&nbsp;==&nbsp;null&nbsp;?&nbsp;"null"&nbsp;:&nbsp;nst.getValue()));</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='353'/>353</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("&nbsp;&nbsp;&nbsp;&nbsp;Code:&nbsp;"&nbsp;+&nbsp;n.getCode());</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='354'/>354</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("&nbsp;&nbsp;&nbsp;&nbsp;Message:&nbsp;"&nbsp;+&nbsp;n.getMessage());</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='355'/>355</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("&nbsp;&nbsp;&nbsp;&nbsp;Source:&nbsp;"&nbsp;+&nbsp;n.getSource());</td>
</tr>
<tr class="noCover">
<td class="line"><a name='356'/>356</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='357'/>357</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='358'/>358</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='359'/>359</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;static&nbsp;void&nbsp;updateEndPoint(ShipServiceLocator&nbsp;serviceLocator)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='360'/>360</td>
<td class="hits">2</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String&nbsp;endPoint&nbsp;=&nbsp;System.getProperty("endPoint");</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='361'/>361</td>
<td class="hits">2</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if&nbsp;(endPoint&nbsp;==&nbsp;null)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='362'/>362</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;endPoint&nbsp;=&nbsp;"http://ALM-Client:7200/ShipService";</td>
</tr>
<tr class="noCover">
<td class="line"><a name='363'/>363</td>
<td class="hits"/>
<td class="code">//&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;endPoint&nbsp;=&nbsp;"https://wsbeta.fedex.com:443/web-services/ship";</td>
</tr>
<tr class="noCover">
<td class="line"><a name='364'/>364</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='365'/>365</td>
<td class="hits">2</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;serviceLocator.setShipServicePortEndpointAddress(endPoint);</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='366'/>366</td>
<td class="hits">2</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='367'/>367</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='368'/>368</td>
<td class="hits"/>
<td class="code">}</td>
</tr>
