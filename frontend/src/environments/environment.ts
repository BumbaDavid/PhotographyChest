// This file can be replaced during build by using the `fileReplacements` array.
// `ng build` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.


export const environment = {
  production: false,
  credentialsURL : "http://localhost:8080/api/credentials",
  signUpURL : "http://localhost:8080/api/signup",
  activeAccount: "http://localhost:8080/api/account",
  portofolio: "http://localhost:8080/api/activeaccount",
  categories: "http://localhost:8080/api/categories",
  account: "http://localhost:8080/api/portofolios",
  photos : "http://localhost:8080/api/portofolio",
  upload: "http://localhost:8080/api/portofolio/savephoto",
  delete:"http://localhost:8080/api/portofolio/delete",
  saveOrder : "http://localhost:8080/api/orders/save",
  getOrder : "http://localhost:8080/api/orders/customer",
  editPhoto : "http://localhost:8080/api/edit/portofolio",
  boughtPhotos: "http://localhost:8080/api/orders/photographer",
  acceptOrder :"http://localhost:8080/api/orders/accept",
  rejectOrder: "http://localhost:8080/api/orders/declined"

};


/*
 * For easier debugging in development mode, you can import the following file
 * to ignore zone related error stack frames such as `zone.run`, `zoneDelegate.invokeTask`.
 *
 * This import should be commented out in production mode because it will have a negative impact
 * on performance if an error is thrown.
 */
// import 'zone.js/plugins/zone-error';  // Included with Angular CLI.
